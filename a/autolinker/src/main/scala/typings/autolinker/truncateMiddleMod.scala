package typings.autolinker

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object truncateMiddleMod {
  
  @JSImport("autolinker/dist/commonjs/truncate/truncate-middle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def truncateMiddle(url: String, truncateLen: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateMiddle")(url.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def truncateMiddle(url: String, truncateLen: Double, ellipsisChars: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("truncateMiddle")(url.asInstanceOf[js.Any], truncateLen.asInstanceOf[js.Any], ellipsisChars.asInstanceOf[js.Any])).asInstanceOf[String]
}
