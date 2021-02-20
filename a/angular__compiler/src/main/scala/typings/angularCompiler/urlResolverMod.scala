package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlResolverMod {
  
  @js.native
  trait UrlResolver extends StObject {
    
    def resolve(baseUrl: String, url: String): String = js.native
  }
  object UrlResolver {
    
    @JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
    @js.native
    val ^ : UrlResolverCtor = js.native
    
    @scala.inline
    implicit class UrlResolverMutableBuilder[Self <: UrlResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setResolve(value: (String, String) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
  @js.native
  class UrlResolverCls () extends UrlResolver {
    def this(packagePrefix: String) = this()
  }
  
  @JSImport("@angular/compiler/src/url_resolver", "createOfflineCompileUrlResolver")
  @js.native
  def createOfflineCompileUrlResolver(): UrlResolver = js.native
  
  @JSImport("@angular/compiler/src/url_resolver", "createUrlResolverWithoutPackagePrefix")
  @js.native
  def createUrlResolverWithoutPackagePrefix(): UrlResolver = js.native
  
  @JSImport("@angular/compiler/src/url_resolver", "getUrlScheme")
  @js.native
  def getUrlScheme(url: String): String = js.native
  
  @js.native
  trait UrlResolverCtor
    extends Instantiable0[UrlResolver]
       with Instantiable1[/* packagePrefix */ String, UrlResolver]
}
