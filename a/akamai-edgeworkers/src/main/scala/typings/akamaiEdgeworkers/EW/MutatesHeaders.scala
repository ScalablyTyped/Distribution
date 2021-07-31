package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MutatesHeaders extends StObject {
  
  /**
    * Add value(s) to header
    */
  def addHeader(name: String, value: String): Unit = js.native
  def addHeader(name: String, value: js.Array[String]): Unit = js.native
  
  /**
    * Removes header
    */
  def removeHeader(name: String): Unit = js.native
  
  /**
    * Sets header value(s), replacing previous one(s)
    */
  def setHeader(name: String, value: String): Unit = js.native
  def setHeader(name: String, value: js.Array[String]): Unit = js.native
}
