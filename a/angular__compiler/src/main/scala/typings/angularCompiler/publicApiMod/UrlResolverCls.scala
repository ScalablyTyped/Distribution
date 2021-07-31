package typings.angularCompiler.publicApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSImport("@angular/compiler/public_api", "UrlResolver")
@js.native
class UrlResolverCls ()
  extends StObject
     with typings.angularCompiler.urlResolverMod.UrlResolver {
  def this(packagePrefix: String) = this()
  
  /* CompleteClass */
  override def resolve(baseUrl: String, url: String): String = js.native
}
