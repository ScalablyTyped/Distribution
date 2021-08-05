package typings.angularCompiler

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object urlResolverMod {
  
  @JSImport("@angular/compiler/src/url_resolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait UrlResolver extends StObject {
    
    def resolve(baseUrl: String, url: String): String
  }
  object UrlResolver {
    
    @JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
    @js.native
    val ^ : UrlResolverCtor = js.native
    
    extension [Self <: UrlResolver](x: Self) {
      
      inline def setResolve(value: (String, String) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
    }
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler/src/url_resolver", "UrlResolver")
  @js.native
  class UrlResolverCls ()
    extends StObject
       with UrlResolver {
    def this(packagePrefix: String) = this()
    
    /* CompleteClass */
    override def resolve(baseUrl: String, url: String): String = js.native
  }
  
  inline def createOfflineCompileUrlResolver(): UrlResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createOfflineCompileUrlResolver")().asInstanceOf[UrlResolver]
  
  inline def createUrlResolverWithoutPackagePrefix(): UrlResolver = ^.asInstanceOf[js.Dynamic].applyDynamic("createUrlResolverWithoutPackagePrefix")().asInstanceOf[UrlResolver]
  
  inline def getUrlScheme(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getUrlScheme")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @js.native
  trait UrlResolverCtor
    extends StObject
       with Instantiable0[UrlResolver]
       with Instantiable1[/* packagePrefix */ String, UrlResolver]
}
