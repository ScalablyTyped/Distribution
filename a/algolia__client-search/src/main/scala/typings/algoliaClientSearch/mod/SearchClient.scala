package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.Transporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchClient extends StObject {
  
  /**
    * Mutates the transporter, adding the given user agent.
    */
  def addAlgoliaAgent(segment: String): Unit = js.native
  def addAlgoliaAgent(segment: String, version: String): Unit = js.native
  
  /**
    * The application id.
    */
  val appId: String = js.native
  
  /**
    * Clears both requests and responses caches.
    */
  def clearCache(): ReadonlyPromisevoid = js.native
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter = js.native
}
