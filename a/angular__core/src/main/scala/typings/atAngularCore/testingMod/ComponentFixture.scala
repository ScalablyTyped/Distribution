package typings.atAngularCore.testingMod

import typings.atAngularCore.atAngularCoreMod.ComponentRef
import typings.atAngularCore.atAngularCoreMod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/core/testing", "ComponentFixture")
@js.native
class ComponentFixture[T] protected ()
  extends typings.atAngularCore.testingTestingMod.ComponentFixture[T] {
  def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
  def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
}

