package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.mod.AnalyticsNode.Identity
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AnonymousId extends Identity {
    
    var anonymousId: String | Double = js.native
    
    var userId: js.UndefOr[String | Double] = js.native
  }
  object AnonymousId {
    
    @scala.inline
    def apply(anonymousId: String | Double): AnonymousId = {
      val __obj = js.Dynamic.literal(anonymousId = anonymousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnonymousId]
    }
    
    @scala.inline
    implicit class AnonymousIdMutableBuilder[Self <: AnonymousId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  @js.native
  trait Category extends StObject {
    
    var category: js.UndefOr[String] = js.native
    
    var context: js.UndefOr[js.Any] = js.native
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
  }
  object Category {
    
    @scala.inline
    def apply(): Category = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Category]
    }
    
    @scala.inline
    implicit class CategoryMutableBuilder[Self <: Category] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  @js.native
  trait Context extends StObject {
    
    var _metadata: NodeVersion = js.native
    
    var context: Dictkey = js.native
    
    var messageId: js.UndefOr[String] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
    
    var `type`: String = js.native
  }
  object Context {
    
    @scala.inline
    def apply(_metadata: NodeVersion, context: Dictkey, `type`: String): Context = {
      val __obj = js.Dynamic.literal(_metadata = _metadata.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: Dictkey): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_metadata(value: NodeVersion): Self = StObject.set(x, "_metadata", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.Any] {
    
    var library: Name = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(library: Name): Dictkey = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLibrary(value: Name): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.native
    
    var flushAt: js.UndefOr[Double] = js.native
    
    var flushInterval: js.UndefOr[Double] = js.native
    
    var host: js.UndefOr[String] = js.native
    
    var timeout: js.UndefOr[Double | String] = js.native
  }
  object Enable {
    
    @scala.inline
    def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit class EnableMutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      @scala.inline
      def setFlushAt(value: Double): Self = StObject.set(x, "flushAt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushAtUndefined: Self = StObject.set(x, "flushAt", js.undefined)
      
      @scala.inline
      def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      @scala.inline
      def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  @js.native
  trait Event extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var event: String = js.native
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
    
    var properties: js.UndefOr[js.Any] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
  }
  object Event {
    
    @scala.inline
    def apply(event: String): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    @scala.inline
    implicit class EventMutableBuilder[Self <: Event] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  @js.native
  trait GroupId extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var groupId: String | Double = js.native
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
    
    var traits: js.UndefOr[js.Any] = js.native
  }
  object GroupId {
    
    @scala.inline
    def apply(groupId: String | Double): GroupId = {
      val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GroupId]
    }
    
    @scala.inline
    implicit class GroupIdMutableBuilder[Self <: GroupId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTraits(value: js.Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  @js.native
  trait Integrations extends StObject {
    
    var context: js.UndefOr[js.Any] = js.native
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
    
    var timestamp: js.UndefOr[Date] = js.native
    
    var traits: js.UndefOr[js.Any] = js.native
  }
  object Integrations {
    
    @scala.inline
    def apply(): Integrations = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Integrations]
    }
    
    @scala.inline
    implicit class IntegrationsMutableBuilder[Self <: Integrations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      @scala.inline
      def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      @scala.inline
      def setTraits(value: js.Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var version: String = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, version: String): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NodeVersion
    extends /* key */ StringDictionary[js.Any] {
    
    var nodeVersion: String = js.native
  }
  object NodeVersion {
    
    @scala.inline
    def apply(nodeVersion: String): NodeVersion = {
      val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeVersion]
    }
    
    @scala.inline
    implicit class NodeVersionMutableBuilder[Self <: NodeVersion] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreviousId extends StObject {
    
    var integrations: js.UndefOr[typings.analyticsNode.mod.AnalyticsNode.Integrations] = js.native
    
    var previousId: String | Double = js.native
  }
  object PreviousId {
    
    @scala.inline
    def apply(previousId: String | Double): PreviousId = {
      val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreviousId]
    }
    
    @scala.inline
    implicit class PreviousIdMutableBuilder[Self <: PreviousId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIntegrations(value: typings.analyticsNode.mod.AnalyticsNode.Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      @scala.inline
      def setPreviousId(value: String | Double): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait UserId extends Identity {
    
    var userId: String | Double = js.native
  }
  object UserId {
    
    @scala.inline
    def apply(userId: String | Double): UserId = {
      val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserId]
    }
    
    @scala.inline
    implicit class UserIdMutableBuilder[Self <: UserId] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    }
  }
}
