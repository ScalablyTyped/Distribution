package typings.aliDashApp

import typings.aliDashApp.myNs.App
import typings.aliDashApp.myNs.AppOptions
import typings.aliDashApp.myNs.Component
import typings.aliDashApp.myNs.Page
import typings.aliDashApp.myNs.PageOptions
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  def App(app: Partial[AppOptions with typings.aliDashApp.myNs.App]): Unit = js.native
  def Behavior(): Component = js.native
  def Behavior(options: js.Any): Component = js.native
  def Component(): typings.aliDashApp.myNs.Component = js.native
  def Component(options: js.Any): typings.aliDashApp.myNs.Component = js.native
  def Page(options: Partial[PageOptions with typings.aliDashApp.myNs.Page]): Unit = js.native
  def getApp(): App = js.native
  def getCurrentPages(): js.Array[Page] = js.native
}

