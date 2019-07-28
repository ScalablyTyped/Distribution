package typings.atAngularCore.atAngularCoreMod

import typings.atAngularCore.atAngularCoreNumbers.`0`
import typings.atAngularCore.atAngularCoreNumbers.`1024`
import typings.atAngularCore.atAngularCoreNumbers.`128`
import typings.atAngularCore.atAngularCoreNumbers.`12`
import typings.atAngularCore.atAngularCoreNumbers.`13`
import typings.atAngularCore.atAngularCoreNumbers.`16`
import typings.atAngularCore.atAngularCoreNumbers.`1792`
import typings.atAngularCore.atAngularCoreNumbers.`1`
import typings.atAngularCore.atAngularCoreNumbers.`256`
import typings.atAngularCore.atAngularCoreNumbers.`2`
import typings.atAngularCore.atAngularCoreNumbers.`32`
import typings.atAngularCore.atAngularCoreNumbers.`4`
import typings.atAngularCore.atAngularCoreNumbers.`512`
import typings.atAngularCore.atAngularCoreNumbers.`64`
import typings.atAngularCore.atAngularCoreNumbers.`768`
import typings.atAngularCore.atAngularCoreNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Bitmask of states
  */
/* Rewritten from type alias, can be one of: 
  - typings.atAngularCore.atAngularCoreNumbers.`1`
  - typings.atAngularCore.atAngularCoreNumbers.`2`
  - typings.atAngularCore.atAngularCoreNumbers.`4`
  - typings.atAngularCore.atAngularCoreNumbers.`8`
  - typings.atAngularCore.atAngularCoreNumbers.`16`
  - typings.atAngularCore.atAngularCoreNumbers.`32`
  - typings.atAngularCore.atAngularCoreNumbers.`64`
  - typings.atAngularCore.atAngularCoreNumbers.`128`
  - typings.atAngularCore.atAngularCoreNumbers.`1792`
  - typings.atAngularCore.atAngularCoreNumbers.`0`
  - typings.atAngularCore.atAngularCoreNumbers.`256`
  - typings.atAngularCore.atAngularCoreNumbers.`512`
  - typings.atAngularCore.atAngularCoreNumbers.`768`
  - typings.atAngularCore.atAngularCoreNumbers.`1024`
  - typings.atAngularCore.atAngularCoreNumbers.`12`
  - typings.atAngularCore.atAngularCoreNumbers.`13`
*/
trait ViewState extends js.Object

object ViewState {
  @scala.inline
  def Attached: `4` = this.cast(4)
  @scala.inline
  def BeforeFirstCheck: `1` = this.cast(1)
  @scala.inline
  def CatDetectChanges: `12` = this.cast(12)
  @scala.inline
  def CatInit: `13` = this.cast(13)
  @scala.inline
  def CheckProjectedView: `32` = this.cast(32)
  @scala.inline
  def CheckProjectedViews: `64` = this.cast(64)
  @scala.inline
  def ChecksEnabled: `8` = this.cast(8)
  @scala.inline
  def Destroyed: `128` = this.cast(128)
  @scala.inline
  def FirstCheck: `2` = this.cast(2)
  @scala.inline
  def InitState_AfterInit: `1024` = this.cast(1024)
  @scala.inline
  def InitState_BeforeInit: `0` = this.cast(0)
  @scala.inline
  def InitState_CallingAfterContentInit: `512` = this.cast(512)
  @scala.inline
  def InitState_CallingAfterViewInit: `768` = this.cast(768)
  @scala.inline
  def InitState_CallingOnInit: `256` = this.cast(256)
  @scala.inline
  def InitState_Mask: `1792` = this.cast(1792)
  @scala.inline
  def IsProjectedView: `16` = this.cast(16)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

