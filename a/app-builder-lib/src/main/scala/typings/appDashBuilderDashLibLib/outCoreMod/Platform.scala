package typings
package appDashBuilderDashLibLib.outCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("app-builder-lib/out/core", "Platform")
@js.native
class Platform protected () extends js.Object {
  def this(name: java.lang.String, buildConfigurationKey: java.lang.String, nodeName: nodeLib.NodeJSNs.Platform) = this()
  var buildConfigurationKey: java.lang.String = js.native
  var name: java.lang.String = js.native
  var nodeName: nodeLib.NodeJSNs.Platform = js.native
  def createTarget(): nodeLib.Map[
    Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTarget(archs: builderDashUtilLib.outArchMod.Arch*): nodeLib.Map[
    Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTarget(`type`: java.lang.String, archs: builderDashUtilLib.outArchMod.Arch*): nodeLib.Map[
    Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
  def createTarget(`type`: js.Array[java.lang.String], archs: builderDashUtilLib.outArchMod.Arch*): nodeLib.Map[
    Platform, 
    nodeLib.Map[builderDashUtilLib.outArchMod.Arch, js.Array[java.lang.String]]
  ] = js.native
}

/* static members */
@JSImport("app-builder-lib/out/core", "Platform")
@js.native
object Platform extends js.Object {
  var LINUX: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  var MAC: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  var WINDOWS: appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  def current(): appDashBuilderDashLibLib.outCoreMod.Platform = js.native
  def fromString(name: java.lang.String): appDashBuilderDashLibLib.outCoreMod.Platform = js.native
}

