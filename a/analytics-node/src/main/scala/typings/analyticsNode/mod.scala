package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.anon.Category
import typings.analyticsNode.anon.Context
import typings.analyticsNode.anon.Enable
import typings.analyticsNode.anon.Event
import typings.analyticsNode.anon.GroupId
import typings.analyticsNode.anon.PreviousId
import typings.analyticsNode.mod.AnalyticsNode.Analytics
import typings.std.Date
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("analytics-node", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Analytics {
    def this(writeKey: String) = this()
    def this(writeKey: String, opts: Enable) = this()
  }
  
  object AnalyticsNode {
    
    @js.native
    trait Analytics extends StObject {
      
      /* alias is how you associate one identity with another. */
      def alias(message: Identity & PreviousId): Analytics = js.native
      def alias(message: Identity & PreviousId, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
      
      /* Flush batched calls to make sure nothing is left in the queue */
      def flush(): Analytics = js.native
      def flush(callback: js.Function2[/* err */ Error, /* data */ Data, Unit]): Analytics = js.native
      
      /* Group calls can be used to associate individual users with shared
        accounts or companies. */
      def group(message: Identity & GroupId): Analytics = js.native
      def group(message: Identity & GroupId, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
      
      /* The identify method lets you tie a user to their actions and record
        traits about them. */
      def identify(message: Identity & typings.analyticsNode.anon.Integrations): Analytics = js.native
      def identify(
        message: Identity & typings.analyticsNode.anon.Integrations,
        callback: js.Function1[/* err */ Error, Unit]
      ): Analytics = js.native
      
      /* The page method lets you record page views on your website, along with
        optional extra information about the page being viewed. */
      def page(message: Identity & Category): Analytics = js.native
      def page(message: Identity & Category, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
      
      /* The track method lets you record the actions your users perform. */
      def track(message: Identity & Event): Analytics = js.native
      def track(message: Identity & Event, callback: js.Function1[/* err */ Error, Unit]): Analytics = js.native
    }
    
    trait Data extends StObject {
      
      var batch: js.Array[Message]
      
      var sentAt: Date
      
      var timestamp: Date
    }
    object Data {
      
      @scala.inline
      def apply(batch: js.Array[Message], sentAt: Date, timestamp: Date): Data = {
        val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Data]
      }
      
      @scala.inline
      implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setBatch(value: js.Array[Message]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setBatchVarargs(value: Message*): Self = StObject.set(x, "batch", js.Array(value :_*))
        
        @scala.inline
        def setSentAt(value: Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.analyticsNode.anon.UserId
      - typings.analyticsNode.anon.AnonymousId
    */
    trait Identity extends StObject
    object Identity {
      
      @scala.inline
      def AnonymousId(anonymousId: String | Double): typings.analyticsNode.anon.AnonymousId = {
        val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.analyticsNode.anon.AnonymousId]
      }
      
      @scala.inline
      def UserId(userId: String | Double): typings.analyticsNode.anon.UserId = {
        val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.analyticsNode.anon.UserId]
      }
    }
    
    type IntegrationValue = Boolean | StringDictionary[js.Any]
    
    type Integrations = StringDictionary[IntegrationValue]
    
    type Message = Identity & Context
  }
}
