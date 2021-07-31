package typings.activexAdox.ADOX

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Users extends StObject {
  
  def apply(Item: String): User = js.native
  def apply(Item: Double): User = js.native
  
  def Append(Item: String): Unit = js.native
  def Append(Item: String, Password: String): Unit = js.native
  /** @param Password [Password=''] */
  def Append(Item: User): Unit = js.native
  def Append(Item: User, Password: String): Unit = js.native
  
  val Count: Double = js.native
  
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  
  def Item(Item: String): User = js.native
  def Item(Item: Double): User = js.native
  
  def Refresh(): Unit = js.native
}
