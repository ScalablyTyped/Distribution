package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait _ResourceManager extends js.Object {
  def addResources(resource: Res): Promise = js.native
  def addResources(resource: Res, group: java.lang.String): Promise = js.native
  def getCanvasFromImage(image: stdLib.HTMLImageElement): stdLib.HTMLCanvasElement = js.native
  def getResourceById(id: java.lang.String): js.Any = js.native
  def getResourceById(id: java.lang.String, group: java.lang.String): js.Any = js.native
  def getResourceById(id: java.lang.String, group: java.lang.String, fullObject: scala.Boolean): js.Any = js.native
  def loadAudio(res: Res): Promise = js.native
  def loadAudio(res: Res, group: java.lang.String): Promise = js.native
  def loadImage(res: Res): Promise = js.native
  def loadImage(res: Res, group: java.lang.String): Promise = js.native
  def loadResources(group: java.lang.String): scala.Unit = js.native
  def loadResources(group: java.lang.String, progressCb: Callback): scala.Unit = js.native
  def loadResources(group: java.lang.String, progressCb: Callback, errorCb: Callback): scala.Unit = js.native
  def newResourceFromPool(id: java.lang.String): js.Any = js.native
  def registerScript(id: java.lang.String, elt: js.Any): scala.Unit = js.native
  def registerScript(id: java.lang.String, elt: js.Any, poolSize: scala.Double): scala.Unit = js.native
}

