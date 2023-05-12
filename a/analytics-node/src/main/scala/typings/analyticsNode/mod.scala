package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.anon.Batch
import typings.analyticsNode.anon.Category
import typings.analyticsNode.anon.Context
import typings.analyticsNode.anon.Enable
import typings.analyticsNode.anon.Event
import typings.analyticsNode.anon.GroupId
import typings.analyticsNode.anon.PreviousId
import typings.analyticsNode.anon.Properties
import typings.analyticsNode.mod.AnalyticsNode.Analytics
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("analytics-node", JSImport.Namespace)
  @js.native
  open class ^ protected ()
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
      def alias(message: Identity & PreviousId, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* Flush batched calls to make sure nothing is left in the queue */
      def flush(): js.Promise[Batch] = js.native
      def flush(callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): js.Promise[Batch] = js.native
      
      /* Group calls can be used to associate individual users with shared
        accounts or companies. */
      def group(message: Identity & GroupId): Analytics = js.native
      def group(message: Identity & GroupId, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The identify method lets you tie a user to their actions and record
        traits about them. */
      def identify(message: Identity & typings.analyticsNode.anon.Integrations): Analytics = js.native
      def identify(
        message: Identity & typings.analyticsNode.anon.Integrations,
        callback: js.Function1[/* err */ js.Error, Unit]
      ): Analytics = js.native
      
      /* The page method lets you record page views on your website, along with
        optional extra information about the page being viewed. */
      def page(message: Identity & Category): Analytics = js.native
      def page(message: Identity & Category, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The screen method lets you record whenever a user sees a screen,
        the mobile equivalent of page, in your mobile app, along with
        any properties about the screen. */
      def screen(message: Identity & Properties): Analytics = js.native
      def screen(message: Identity & Properties, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The track method lets you record the actions your users perform. */
      def track(message: Identity & Event): Analytics = js.native
      def track(message: Identity & Event, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
    }
    
    trait Data extends StObject {
      
      var batch: js.Array[Message]
      
      var sentAt: js.Date
      
      var timestamp: js.Date
    }
    object Data {
      
      inline def apply(batch: js.Array[Message], sentAt: js.Date, timestamp: js.Date): Data = {
        val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
        __obj.asInstanceOf[Data]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
        
        inline def setBatch(value: js.Array[Message]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
        
        inline def setBatchVarargs(value: Message*): Self = StObject.set(x, "batch", js.Array(value*))
        
        inline def setSentAt(value: js.Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    /* Rewritten from type alias, can be one of: 
      - typings.analyticsNode.anon.UserId
      - typings.analyticsNode.anon.AnonymousId
    */
    trait Identity extends StObject
    object Identity {
      
      inline def AnonymousId(anonymousId: String | Double): typings.analyticsNode.anon.AnonymousId = {
        val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.analyticsNode.anon.AnonymousId]
      }
      
      inline def UserId(userId: String | Double): typings.analyticsNode.anon.UserId = {
        val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.analyticsNode.anon.UserId]
      }
    }
    
    type IntegrationValue = Boolean | StringDictionary[Any]
    
    type Integrations = StringDictionary[IntegrationValue]
    
    type Message = Identity & Context
  }
}
