package typings.atobLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(encodedData: String): DecodedData = ^.asInstanceOf[js.Dynamic].apply(encodedData.asInstanceOf[js.Any]).asInstanceOf[DecodedData]
  
  @JSImport("atob-lite", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type DecodedData = String
}
