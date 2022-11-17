package typings.angularCompilerCli

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVersionHelpersMod {
  
  @JSImport("@angular/compiler-cli/src/version_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compareNumbers(a: js.Array[Double], b: js.Array[Double]): -1 | 0 | 1 = (^.asInstanceOf[js.Dynamic].applyDynamic("compareNumbers")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[-1 | 0 | 1]
  
  inline def compareVersions(v1: String, v2: String): -1 | 0 | 1 = (^.asInstanceOf[js.Dynamic].applyDynamic("compareVersions")(v1.asInstanceOf[js.Any], v2.asInstanceOf[js.Any])).asInstanceOf[-1 | 0 | 1]
  
  inline def isVersionBetween(version: String, low: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVersionBetween")(version.asInstanceOf[js.Any], low.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isVersionBetween(version: String, low: String, high: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isVersionBetween")(version.asInstanceOf[js.Any], low.asInstanceOf[js.Any], high.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toNumbers(value: String): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumbers")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
}
