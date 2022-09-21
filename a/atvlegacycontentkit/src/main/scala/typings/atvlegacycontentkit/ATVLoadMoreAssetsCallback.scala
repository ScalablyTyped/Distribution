package typings.atvlegacycontentkit

import typings.atvlegacycontentkit.atv.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The callback used when the player asks for more assets.
  */
// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait ATVLoadMoreAssetsCallback extends StObject {
  
  /**
    * The new asset was not able to be retrieved.
    * @param error The error message.
    */
  def failure(): Unit = js.native
  def failure(error: String): Unit = js.native
  
  /**
    * The new asset was successfully retrieved.
    * @param element The element containing the new asset. Make this null if the request was successful but there's no new assets.
    */
  def success(): Unit = js.native
  def success(element: Element): Unit = js.native
}
