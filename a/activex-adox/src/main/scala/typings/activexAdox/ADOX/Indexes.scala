package typings.activexAdox.ADOX

import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Indexes extends StObject {
  
  def apply(Item: String): Index = js.native
  def apply(Item: Double): Index = js.native
  
  def Append(Item: String): Unit = js.native
  def Append(Item: String, Columns: String): Unit = js.native
  def Append(Item: String, Columns: SafeArray[String]): Unit = js.native
  def Append(Item: Index): Unit = js.native
  def Append(Item: Index, Columns: String): Unit = js.native
  def Append(Item: Index, Columns: SafeArray[String]): Unit = js.native
  
  // is this actually two overloads, one with [Index] and one with [string,string | SafeArray<string>]?
  val Count: Double = js.native
  
  def Delete(Item: String): Unit = js.native
  def Delete(Item: Double): Unit = js.native
  
  def Item(Item: String): Index = js.native
  def Item(Item: Double): Index = js.native
  
  def Refresh(): Unit = js.native
}
