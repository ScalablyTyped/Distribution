package typings.analyticsNode

import org.scalablytyped.runtime.StringDictionary
import typings.analyticsNode.mod.AnalyticsNode.Integrations
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Batch extends StObject {
    
    var batch: Any
    
    var sentAt: String
    
    var timestamp: String
  }
  object Batch {
    
    inline def apply(batch: Any, sentAt: String, timestamp: String): Batch = {
      val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[Batch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Batch] (val x: Self) extends AnyVal {
      
      inline def setBatch(value: Any): Self = StObject.set(x, "batch", value.asInstanceOf[js.Any])
      
      inline def setSentAt(value: String): Self = StObject.set(x, "sentAt", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var library: Name
  }
  object Dictkey {
    
    inline def apply(library: Name): Dictkey = {
      val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setLibrary(value: Name): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    }
  }
  
  trait Enable extends StObject {
    
    var enable: js.UndefOr[Boolean] = js.undefined
    
    var flushAt: js.UndefOr[Double] = js.undefined
    
    var flushInterval: js.UndefOr[Double] = js.undefined
    
    var flushed: js.UndefOr[Boolean] = js.undefined
    
    var host: js.UndefOr[String] = js.undefined
    
    var timeout: js.UndefOr[Double | String] = js.undefined
  }
  object Enable {
    
    inline def apply(): Enable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Enable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Enable] (val x: Self) extends AnyVal {
      
      inline def setEnable(value: Boolean): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
      
      inline def setEnableUndefined: Self = StObject.set(x, "enable", js.undefined)
      
      inline def setFlushAt(value: Double): Self = StObject.set(x, "flushAt", value.asInstanceOf[js.Any])
      
      inline def setFlushAtUndefined: Self = StObject.set(x, "flushAt", js.undefined)
      
      inline def setFlushInterval(value: Double): Self = StObject.set(x, "flushInterval", value.asInstanceOf[js.Any])
      
      inline def setFlushIntervalUndefined: Self = StObject.set(x, "flushInterval", js.undefined)
      
      inline def setFlushed(value: Boolean): Self = StObject.set(x, "flushed", value.asInstanceOf[js.Any])
      
      inline def setFlushedUndefined: Self = StObject.set(x, "flushed", js.undefined)
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      inline def setTimeout(value: Double | String): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  category :string | undefined,   name :string | undefined,   properties :any | undefined,   timestamp :std.Date | undefined,   context :any | undefined,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined,   messageId :string | undefined} */
  trait Identitycategorystringund extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var category: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var messageId: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object Identitycategorystringund {
    
    inline def apply(): Identitycategorystringund = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identitycategorystringund]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identitycategorystringund] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
      
      inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
      
      inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  event :string,   properties :any | undefined,   timestamp :std.Date | undefined,   context :any | undefined,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined} */
  trait Identityeventstringproper extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var event: String
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object Identityeventstringproper {
    
    inline def apply(event: String): Identityeventstringproper = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identityeventstringproper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identityeventstringproper] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  groupId :string | number,   traits :any | undefined,   context :any | undefined,   timestamp :std.Date | undefined,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined} */
  trait IdentitygroupIdstringnumb extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var groupId: String | Double
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var traits: js.UndefOr[Any] = js.undefined
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object IdentitygroupIdstringnumb {
    
    inline def apply(groupId: String | Double): IdentitygroupIdstringnumb = {
      val __obj = js.Dynamic.literal(groupId = groupId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentitygroupIdstringnumb]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentitygroupIdstringnumb] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setGroupId(value: String | Double): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTraits(value: Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  name :string | undefined,   properties :any | undefined,   timestamp :std.Date | undefined,   context :any | undefined,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined} */
  trait Identitynamestringundefin extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var properties: js.UndefOr[Any] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object Identitynamestringundefin {
    
    inline def apply(): Identitynamestringundefin = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identitynamestringundefin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identitynamestringundefin] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
      
      inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  previousId :string | number,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined} */
  trait IdentitypreviousIdstringn extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var previousId: String | Double
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object IdentitypreviousIdstringn {
    
    inline def apply(previousId: String | Double): IdentitypreviousIdstringn = {
      val __obj = js.Dynamic.literal(previousId = previousId.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentitypreviousIdstringn]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentitypreviousIdstringn] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setPreviousId(value: String | Double): Self = StObject.set(x, "previousId", value.asInstanceOf[js.Any])
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    }
  }
  
  /* Inlined analytics-node.analytics-node.AnalyticsNode.Identity & {  traits :any | undefined,   timestamp :std.Date | undefined,   context :any | undefined,   integrations :analytics-node.analytics-node.AnalyticsNode.Integrations | undefined} */
  trait Identitytraitsanyundefine extends StObject {
    
    var anonymousId: js.UndefOr[String | Double] = js.undefined
    
    var context: js.UndefOr[Any] = js.undefined
    
    var integrations: js.UndefOr[Integrations] = js.undefined
    
    var timestamp: js.UndefOr[js.Date] = js.undefined
    
    var traits: js.UndefOr[Any] = js.undefined
    
    var userId: js.UndefOr[String | Double] = js.undefined
  }
  object Identitytraitsanyundefine {
    
    inline def apply(): Identitytraitsanyundefine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Identitytraitsanyundefine]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identitytraitsanyundefine] (val x: Self) extends AnyVal {
      
      inline def setAnonymousId(value: String | Double): Self = StObject.set(x, "anonymousId", value.asInstanceOf[js.Any])
      
      inline def setAnonymousIdUndefined: Self = StObject.set(x, "anonymousId", js.undefined)
      
      inline def setContext(value: Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setIntegrations(value: Integrations): Self = StObject.set(x, "integrations", value.asInstanceOf[js.Any])
      
      inline def setIntegrationsUndefined: Self = StObject.set(x, "integrations", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
      
      inline def setTraits(value: Any): Self = StObject.set(x, "traits", value.asInstanceOf[js.Any])
      
      inline def setTraitsUndefined: Self = StObject.set(x, "traits", js.undefined)
      
      inline def setUserId(value: String | Double): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
      
      inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait NodeVersion
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var nodeVersion: String
  }
  object NodeVersion {
    
    inline def apply(nodeVersion: String): NodeVersion = {
      val __obj = js.Dynamic.literal(nodeVersion = nodeVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeVersion]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodeVersion] (val x: Self) extends AnyVal {
      
      inline def setNodeVersion(value: String): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
    }
  }
}
