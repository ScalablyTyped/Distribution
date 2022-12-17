package typings.appBuilderLib

import typings.appBuilderLib.anon.Account
import typings.appBuilderLib.anon.Arch
import typings.appBuilderLib.anon.Channel
import typings.appBuilderLib.anon.Redirect
import typings.appBuilderLib.anon.Release
import typings.appBuilderLib.appBuilderLibStrings.artifacts
import typings.appBuilderLib.appBuilderLibStrings.releases
import typings.builderUtilRuntime.outPublishOptionsMod.KeygenOptions
import typings.electronPublish.mod.HttpPublisher
import typings.electronPublish.mod.PublishContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outPublishKeygenPublisherMod {
  
  @JSImport("app-builder-lib/out/publish/KeygenPublisher", "KeygenPublisher")
  @js.native
  open class KeygenPublisher protected () extends HttpPublisher {
    def this(context: PublishContext, info: KeygenOptions, version: String) = this()
    
    /* private */ val auth: Any = js.native
    
    /* private */ val basePath: Any = js.native
    
    /* private */ var createArtifact: Any = js.native
    
    /* private */ var createRelease: Any = js.native
    
    def deleteRelease(releaseId: String): js.Promise[Unit] = js.native
    
    /* private */ var getOrCreateRelease: Any = js.native
    
    /* private */ var getRelease: Any = js.native
    
    val hostname: /* "api.keygen.sh" */ String = js.native
    
    /* private */ val info: Any = js.native
    
    @JSName("providerName")
    val providerName_FKeygenPublisher: /* "keygen" */ String = js.native
    
    /* private */ var uploadArtifact: Any = js.native
    
    /* private */ val version: Any = js.native
  }
  
  trait KeygenArtifact extends StObject {
    
    var attributes: Arch
    
    var id: String
    
    var links: Redirect
    
    var relationships: Release
    
    var `type`: artifacts
  }
  object KeygenArtifact {
    
    inline def apply(attributes: Arch, id: String, links: Redirect, relationships: Release): KeygenArtifact = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("artifacts")
      __obj.asInstanceOf[KeygenArtifact]
    }
    
    extension [Self <: KeygenArtifact](x: Self) {
      
      inline def setAttributes(value: Arch): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLinks(value: Redirect): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
      
      inline def setRelationships(value: Release): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setType(value: artifacts): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeygenError extends StObject {
    
    var code: String
    
    var detail: String
    
    var title: String
  }
  object KeygenError {
    
    inline def apply(code: String, detail: String, title: String): KeygenError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeygenError]
    }
    
    extension [Self <: KeygenError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait KeygenRelease extends StObject {
    
    var attributes: Channel
    
    var id: String
    
    var relationships: Account
    
    var `type`: releases
  }
  object KeygenRelease {
    
    inline def apply(attributes: Channel, id: String, relationships: Account): KeygenRelease = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], relationships = relationships.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("releases")
      __obj.asInstanceOf[KeygenRelease]
    }
    
    extension [Self <: KeygenRelease](x: Self) {
      
      inline def setAttributes(value: Channel): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setRelationships(value: Account): Self = StObject.set(x, "relationships", value.asInstanceOf[js.Any])
      
      inline def setType(value: releases): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
