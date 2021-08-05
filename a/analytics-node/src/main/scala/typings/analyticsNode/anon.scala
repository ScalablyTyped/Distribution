package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.mod.AnalyticsNode.Identity
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AnonymousId
    extends StObject
       with Identity {
    
    var anonymousId: String | Double
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object AnonymousId {
    
    inline def apply(anonymousId: String | Double): AnonymousId = {
      val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnonymousId]
    }
    
    extension [Self <: AnonymousId](x: Self) {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
  }
  object Category {
    
    inline def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    extension [Self <: Category](x: Self) {
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait Context extends StObject {
    
    var _metadata: NodeVersion
    
    var context: Dictkey
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
    
    var `type`: String
  }
  object Context {
    
    inline def apply(_metadata: NodeVersion, context: Dictkey, `type`: String): Context = {
      val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setContext(value: Dictkey): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def set_metadata(value: NodeVersion): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var library: Name
  }
  object Dictkey {
    
    inline def apply(library: Name): Dictkey = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setLibrary(value: Name): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.undefined
    
    var flushAt: js.UndefOr[Double] = js.undefined
    
    var flushInterval: js.UndefOr[Double] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double | String] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    extension [Self <: Enable](x: Self) {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFlushAt(value: Double): Self = StObject.set(x, "flushAt", value.asInstanceOf[js.Any])
      
      inline def setFlushAtUndefined: Self = StObject.set(x, "flushAt", js.undefined)
      
      inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait Event extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var event: String
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
    
    var properties: js.UndefOr[js.Any] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
  }
  object Event {
    
    inline def apply(event: String): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait GroupId extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var groupId: String | Double
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
    
    var traits: js.UndefOr[js.Any] = js.undefined
  }
  object GroupId {
    
    inline def apply(groupId: String | Double): GroupId = {
      val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupId]
    }
    
    extension [Self <: GroupId](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTraits(value: js.Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  trait Integrations extends StObject {
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
    
    var timestamp: js.UndefOr[Date] = js.undefined
    
    var traits: js.UndefOr[js.Any] = js.undefined
  }
  object Integrations {
    
    inline def apply(): Integrations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Integrations]
    }
    
    extension [Self <: Integrations](x: Self) {
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTraits(value: js.Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var version: String
  }
  object Name {
    
    inline def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeVersion
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    var nodeVersion: String
  }
  object NodeVersion {
    
    inline def apply(nodeVersion: String): NodeVersion = {
      val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeVersion]
    }
    
    extension [Self <: NodeVersion](x: Self) {
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreviousId extends StObject {
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.undefined
    
    var previousId: String | Double
  }
  object PreviousId {
    
    inline def apply(previousId: String | Double): PreviousId = {
      val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousId]
    }
    
    extension [Self <: PreviousId](x: Self) {
      
      inline def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setPreviousId(value: String | Double): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UserId
    extends StObject
       with Identity {
    
    var userId: String | Double
  }
  object UserId {
    
    inline def apply(userId: String | Double): UserId = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserId]
    }
    
    extension [Self <: UserId](x: Self) {
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
