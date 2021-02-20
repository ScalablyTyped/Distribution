package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`10`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBarControls extends StObject {
  
  def apply(Index: String): CommandBarControl = js.native
  def apply(Index: Double): CommandBarControl = js.native
  
  def Add(
    Type: js.UndefOr[`1` | `2` | `3` | `4` | `10`],
    Id: js.UndefOr[Double],
    Parameter: js.UndefOr[js.Any],
    Before: js.UndefOr[Double],
    Temporary: js.UndefOr[Boolean]
  ): CommandBarControl = js.native
  
  val Application: js.Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): CommandBarControl = js.native
  def Item(Index: Double): CommandBarControl = js.native
  
  val Parent: CommandBar = js.native
}
