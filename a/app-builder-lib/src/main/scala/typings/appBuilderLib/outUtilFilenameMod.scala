package typings.appBuilderLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outUtilFilenameMod {
  
  @JSImport("app-builder-lib/out/util/filename", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCompleteExtname(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCompleteExtname")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def sanitizeFileName(s: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeFileName")(s.asInstanceOf[js.Any]).asInstanceOf[String]
}
