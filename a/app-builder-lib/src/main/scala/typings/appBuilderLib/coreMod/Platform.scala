package typings.appBuilderLib.coreMod

import typings.builderUtil.archMod.Arch
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/core", "Platform")
@js.native
class Platform protected () extends js.Object {
  def this(
    name: String,
    buildConfigurationKey: String,
    nodeName: typings.node.processMod.global.NodeJS.Platform
  ) = this()
  var buildConfigurationKey: String = js.native
  var name: String = js.native
  var nodeName: typings.node.processMod.global.NodeJS.Platform = js.native
  def createTarget(`type`: js.UndefOr[scala.Nothing], archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTarget(`type`: String, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTarget(`type`: js.Array[String], archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
  def createTarget(`type`: Null, archs: Arch*): Map[Platform, Map[Arch, js.Array[String]]] = js.native
}

/* static members */
@JSImport("app-builder-lib/out/core", "Platform")
@js.native
object Platform extends js.Object {
  var LINUX: Platform = js.native
  var MAC: Platform = js.native
  var WINDOWS: Platform = js.native
  def current(): Platform = js.native
  def fromString(name: String): Platform = js.native
}

