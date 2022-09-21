package typings.aureliaPath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("aurelia-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildQueryString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")().asInstanceOf[String]
  inline def buildQueryString(params: js.Object): String = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(params.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def buildQueryString(params: js.Object, traditional: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(params.asInstanceOf[js.Any], traditional.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def buildQueryString(params: Unit, traditional: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryString")(params.asInstanceOf[js.Any], traditional.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def join(path1: String, path2: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("join")(path1.asInstanceOf[js.Any], path2.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def parseQueryString(queryString: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("parseQueryString")(queryString.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def relativeToFile(name: String, file: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relativeToFile")(name.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[String]
}
