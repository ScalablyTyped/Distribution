package typings.angularCore

import typings.angularCore.anon.Character
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMappingsMod {
  
  @JSImport("@angular/core/schematics/utils/line_mappings", "computeLineStartsMap")
  @js.native
  def computeLineStartsMap(text: String): js.Array[Double] = js.native
  
  @JSImport("@angular/core/schematics/utils/line_mappings", "getLineAndCharacterFromPosition")
  @js.native
  def getLineAndCharacterFromPosition(lineStartsMap: js.Array[Double], position: Double): Character = js.native
}
