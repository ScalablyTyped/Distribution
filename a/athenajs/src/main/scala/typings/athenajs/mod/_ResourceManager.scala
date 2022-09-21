package typings.athenajs.mod

import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait _ResourceManager extends StObject {
  
  def addResources(resource: Res): Promise = js.native
  def addResources(resource: Res, group: String): Promise = js.native
  
  def getCanvasFromImage(image: HTMLImageElement): HTMLCanvasElement = js.native
  
  def getResourceById(id: String): Any = js.native
  def getResourceById(id: String, group: String): Any = js.native
  def getResourceById(id: String, group: String, fullObject: Boolean): Any = js.native
  def getResourceById(id: String, group: Unit, fullObject: Boolean): Any = js.native
  
  def loadAudio(res: Res): Promise = js.native
  def loadAudio(res: Res, group: String): Promise = js.native
  
  def loadImage(res: Res): Promise = js.native
  def loadImage(res: Res, group: String): Promise = js.native
  
  def loadResources(group: String): Unit = js.native
  def loadResources(group: String, progressCb: Unit, errorCb: Callback): Unit = js.native
  def loadResources(group: String, progressCb: Callback): Unit = js.native
  def loadResources(group: String, progressCb: Callback, errorCb: Callback): Unit = js.native
  
  def newResourceFromPool(id: String): Any = js.native
  
  def registerScript(id: String, elt: Any): Unit = js.native
  def registerScript(id: String, elt: Any, poolSize: Double): Unit = js.native
}
