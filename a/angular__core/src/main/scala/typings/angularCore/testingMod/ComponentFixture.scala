package typings.angularCore.testingMod

import typings.angularCore.mod.ComponentRef
import typings.angularCore.mod.NgZone
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/core/testing", "ComponentFixture")
@js.native
class ComponentFixture[T] protected ()
  extends typings.angularCore.testingTestingMod.ComponentFixture[T] {
  def this(componentRef: ComponentRef[T], ngZone: Null, _autoDetect: Boolean) = this()
  def this(componentRef: ComponentRef[T], ngZone: NgZone, _autoDetect: Boolean) = this()
}
