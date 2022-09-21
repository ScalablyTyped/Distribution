package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.anon.Batch
import typings.analyticsNode.anon.Dictkey
import typings.analyticsNode.anon.Enable
import typings.analyticsNode.anon.Identitycategorystringund
import typings.analyticsNode.anon.Identityeventstringproper
import typings.analyticsNode.anon.IdentitygroupIdstringnumb
import typings.analyticsNode.anon.Identitynamestringundefin
import typings.analyticsNode.anon.IdentitypreviousIdstringn
import typings.analyticsNode.anon.Identitytraitsanyundefine
import typings.analyticsNode.anon.NodeVersion
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
      def alias(message: IdentitypreviousIdstringn): Analytics = js.native
      def alias(message: IdentitypreviousIdstringn, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* Flush batched calls to make sure nothing is left in the queue */
      def flush(): js.Promise[Batch] = js.native
      def flush(callback: js.Function2[/* err */ js.Error, /* data */ Data, Unit]): js.Promise[Batch] = js.native
      
      /* Group calls can be used to associate individual users with shared
        accounts or companies. */
      def group(message: IdentitygroupIdstringnumb): Analytics = js.native
      def group(message: IdentitygroupIdstringnumb, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The identify method lets you tie a user to their actions and record
        traits about them. */
      def identify(message: Identitytraitsanyundefine): Analytics = js.native
      def identify(message: Identitytraitsanyundefine, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The page method lets you record page views on your website, along with
        optional extra information about the page being viewed. */
      def page(message: Identitycategorystringund): Analytics = js.native
      def page(message: Identitycategorystringund, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The screen method lets you record whenever a user sees a screen,
        the mobile equivalent of page, in your mobile app, along with
        any properties about the screen. */
      def screen(message: Identitynamestringundefin): Analytics = js.native
      def screen(message: Identitynamestringundefin, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
      
      /* The track method lets you record the actions your users perform. */
      def track(message: Identityeventstringproper): Analytics = js.native
      def track(message: Identityeventstringproper, callback: js.Function1[/* err */ js.Error, Unit]): Analytics = js.native
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
      
      extension [Self <: Data](x: Self) {
        
        inline def setBatch(value: js.Array[Message]): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
        
        inline def setBatchVarargs(value: Message*): Self = StObject.set(x, "batch", js.Array(value*))
        
        inline def setSentAt(value: js.Date): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
        
        inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      }
    }
    
    trait Identity extends StObject {
      
      var anonymousId: js.UndefOr[String | Double] = js.undefined
      
      var userId: js.UndefOr[String | Double] = js.undefined
    }
    object Identity {
      
      inline def apply(): Identity = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Identity]
      }
      
      extension [Self <: Identity](x: Self) {
        
        inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
        
        inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
        
        inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
        
        inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
      }
    }
    
    type IntegrationValue = Boolean | StringDictionary[Any]
    
    type Integrations = StringDictionary[IntegrationValue]
    
    trait Message
      extends StObject
         with Identity {
      
      var _metadata: NodeVersion
      
      var context: Dictkey
      
      var messageId: js.UndefOr[String] = js.undefined
      
      var timestamp: js.UndefOr[js.Date] = js.undefined
      
      var `type`: String
    }
    object Message {
      
      inline def apply(_metadata: NodeVersion, context: Dictkey, `type`: String): Message = {
        val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Message]
      }
      
      extension [Self <: Message](x: Self) {
        
        inline def setContext(value: Dictkey): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
        
        inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
        
        inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
        
        inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
        
        inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
        
        inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def set_metadata(value: NodeVersion): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
      }
    }
  }
}
