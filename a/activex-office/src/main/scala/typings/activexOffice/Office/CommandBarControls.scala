package typings.activexOffice.Office

import typings.activexOffice.activexOfficeNumbers.`10`
import typings.activexOffice.activexOfficeNumbers.`1`
import typings.activexOffice.activexOfficeNumbers.`2`
import typings.activexOffice.activexOfficeNumbers.`3`
import typings.activexOffice.activexOfficeNumbers.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandBarControls extends StObject {
  
  def apply(Index: String): CommandBarControl = js.native
  def apply(Index: Double): CommandBarControl = js.native
  
  def Add(): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Any): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Any, Before: Double): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Any, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Any, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Unit, Before: Double): CommandBarControl = js.native
  def Add(
    Type: `1` | `2` | `3` | `4` | `10`,
    Id: Double,
    Parameter: Unit,
    Before: Double,
    Temporary: Boolean
  ): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Double, Parameter: Unit, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Any): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Any, Before: Double): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Any, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Any, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Unit, Before: Double): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Unit, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: `1` | `2` | `3` | `4` | `10`, Id: Unit, Parameter: Unit, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Any): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Any, Before: Double): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Any, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Any, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Unit, Before: Double): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Unit, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Double, Parameter: Unit, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Any): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Any, Before: Double): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Any, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Any, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Unit, Before: Double): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Unit, Before: Double, Temporary: Boolean): CommandBarControl = js.native
  def Add(Type: Unit, Id: Unit, Parameter: Unit, Before: Unit, Temporary: Boolean): CommandBarControl = js.native
  
  val Application: Any = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): CommandBarControl = js.native
  def Item(Index: Double): CommandBarControl = js.native
  
  val Parent: CommandBar = js.native
}
