package typings.ajv

import typings.ajv.distTypesMod.AnySchema
import typings.ajv.distTypesMod.UriResolver
import typings.uriJs.mod.URIComponents
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCompileResolveMod {
  
  @JSImport("ajv/dist/compile/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _getFullPath(resolver: UriResolver, p: URIComponents): String = (^.asInstanceOf[js.Dynamic].applyDynamic("_getFullPath")(resolver.asInstanceOf[js.Any], p.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getFullPath(resolver: UriResolver): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getFullPath")(resolver.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getFullPath(resolver: UriResolver, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullPath")(resolver.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getFullPath(resolver: UriResolver, id: String, normalize: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullPath")(resolver.asInstanceOf[js.Any], id.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getFullPath(resolver: UriResolver, id: Unit, normalize: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getFullPath")(resolver.asInstanceOf[js.Any], id.asInstanceOf[js.Any], normalize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getSchemaRefs(schema: AnySchema, baseId: String): LocalRefs = (^.asInstanceOf[js.Dynamic].applyDynamic("getSchemaRefs")(schema.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any])).asInstanceOf[LocalRefs]
  
  inline def inlineRef(schema: AnySchema): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineRef")(schema.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def inlineRef(schema: AnySchema, limit: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineRef")(schema.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def inlineRef(schema: AnySchema, limit: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inlineRef")(schema.asInstanceOf[js.Any], limit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def normalizeId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeId")().asInstanceOf[String]
  inline def normalizeId(id: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeId")(id.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resolveUrl(resolver: UriResolver, baseId: String, id: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveUrl")(resolver.asInstanceOf[js.Any], baseId.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ Ref in string ]:? ajv.ajv/dist/types.AnySchemaObject}
    }}}
    */
  @js.native
  trait LocalRefs extends StObject
}
