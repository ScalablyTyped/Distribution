package typings.angularCompilerCli.anon

import typings.angularCompilerCli.ngccSrcWritingPackageJsonUpdaterMod.PackageJsonPropertyPositioning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Before
  extends StObject
     with PackageJsonPropertyPositioning {
  
  var before: String
}
object Before {
  
  inline def apply(before: String): Before = {
    val __obj = js.Dynamic.literal(before = before.asInstanceOf[js.Any])
    __obj.asInstanceOf[Before]
  }
  
  extension [Self <: Before](x: Self) {
    
    inline def setBefore(value: String): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
  }
}
