package typings.angularCompiler.compilerFacadeInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceLoader extends StObject {
  
  def get(url: String): js.Promise[String] | String
}
object ResourceLoader {
  
  @scala.inline
  def apply(get: String => js.Promise[String] | String): ResourceLoader = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[ResourceLoader]
  }
  
  @scala.inline
  implicit class ResourceLoaderMutableBuilder[Self <: ResourceLoader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet(value: String => js.Promise[String] | String): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
  }
}
