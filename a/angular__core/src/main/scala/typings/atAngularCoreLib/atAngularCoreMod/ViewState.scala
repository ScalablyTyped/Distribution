package typings
package atAngularCoreLib.atAngularCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bitmask of states
  */
/* Rewritten from type alias, can be one of: 
  - atAngularCoreLib.atAngularCoreLibNumbers.`1`
  - atAngularCoreLib.atAngularCoreLibNumbers.`2`
  - atAngularCoreLib.atAngularCoreLibNumbers.`4`
  - atAngularCoreLib.atAngularCoreLibNumbers.`8`
  - atAngularCoreLib.atAngularCoreLibNumbers.`16`
  - atAngularCoreLib.atAngularCoreLibNumbers.`32`
  - atAngularCoreLib.atAngularCoreLibNumbers.`64`
  - atAngularCoreLib.atAngularCoreLibNumbers.`128`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1792`
  - atAngularCoreLib.atAngularCoreLibNumbers.`0`
  - atAngularCoreLib.atAngularCoreLibNumbers.`256`
  - atAngularCoreLib.atAngularCoreLibNumbers.`512`
  - atAngularCoreLib.atAngularCoreLibNumbers.`768`
  - atAngularCoreLib.atAngularCoreLibNumbers.`1024`
  - atAngularCoreLib.atAngularCoreLibNumbers.`12`
  - atAngularCoreLib.atAngularCoreLibNumbers.`13`
*/
trait ViewState extends js.Object

object ViewState {
  @scala.inline
  def Attached: atAngularCoreLib.atAngularCoreLibNumbers.`4` = this.cast(4)
  @scala.inline
  def BeforeFirstCheck: atAngularCoreLib.atAngularCoreLibNumbers.`1` = this.cast(1)
  @scala.inline
  def CatDetectChanges: atAngularCoreLib.atAngularCoreLibNumbers.`12` = this.cast(12)
  @scala.inline
  def CatInit: atAngularCoreLib.atAngularCoreLibNumbers.`13` = this.cast(13)
  @scala.inline
  def CheckProjectedView: atAngularCoreLib.atAngularCoreLibNumbers.`32` = this.cast(32)
  @scala.inline
  def CheckProjectedViews: atAngularCoreLib.atAngularCoreLibNumbers.`64` = this.cast(64)
  @scala.inline
  def ChecksEnabled: atAngularCoreLib.atAngularCoreLibNumbers.`8` = this.cast(8)
  @scala.inline
  def Destroyed: atAngularCoreLib.atAngularCoreLibNumbers.`128` = this.cast(128)
  @scala.inline
  def FirstCheck: atAngularCoreLib.atAngularCoreLibNumbers.`2` = this.cast(2)
  @scala.inline
  def InitState_AfterInit: atAngularCoreLib.atAngularCoreLibNumbers.`1024` = this.cast(1024)
  @scala.inline
  def InitState_BeforeInit: atAngularCoreLib.atAngularCoreLibNumbers.`0` = this.cast(0)
  @scala.inline
  def InitState_CallingAfterContentInit: atAngularCoreLib.atAngularCoreLibNumbers.`512` = this.cast(512)
  @scala.inline
  def InitState_CallingAfterViewInit: atAngularCoreLib.atAngularCoreLibNumbers.`768` = this.cast(768)
  @scala.inline
  def InitState_CallingOnInit: atAngularCoreLib.atAngularCoreLibNumbers.`256` = this.cast(256)
  @scala.inline
  def InitState_Mask: atAngularCoreLib.atAngularCoreLibNumbers.`1792` = this.cast(1792)
  @scala.inline
  def IsProjectedView: atAngularCoreLib.atAngularCoreLibNumbers.`16` = this.cast(16)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

