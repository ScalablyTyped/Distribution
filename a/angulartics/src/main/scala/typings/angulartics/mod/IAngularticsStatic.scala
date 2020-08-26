package typings.angulartics.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAngularticsStatic extends js.Object {
  def waitForVendorApi(objectName: String, delay: Double): Unit = js.native
  def waitForVendorApi(
    objectName: String,
    delay: Double,
    containsField: js.UndefOr[scala.Nothing],
    registerFn: js.UndefOr[scala.Nothing],
    onTimeout: Boolean
  ): Unit = js.native
  def waitForVendorApi(objectName: String, delay: Double, containsField: js.UndefOr[scala.Nothing], registerFn: js.Any): Unit = js.native
  def waitForVendorApi(
    objectName: String,
    delay: Double,
    containsField: js.UndefOr[scala.Nothing],
    registerFn: js.Any,
    onTimeout: Boolean
  ): Unit = js.native
  def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any): Unit = js.native
  def waitForVendorApi(
    objectName: String,
    delay: Double,
    containsField: js.Any,
    registerFn: js.UndefOr[scala.Nothing],
    onTimeout: Boolean
  ): Unit = js.native
  def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any, registerFn: js.Any): Unit = js.native
  def waitForVendorApi(objectName: String, delay: Double, containsField: js.Any, registerFn: js.Any, onTimeout: Boolean): Unit = js.native
}

