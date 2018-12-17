package typings
package activexDashAdoxLib.ADOXNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait Indexes extends js.Object {
   // is this actually two overloads, one with [Index] and one with [string,string | SafeArray<string>]?
  val Count: scala.Double = js.native
  def apply(Item: java.lang.String): Index = js.native
  def apply(Item: scala.Double): Index = js.native
  def Append(Item: Index): scala.Unit = js.native
  def Append(Item: Index, Columns: activexDashInteropLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def Append(Item: Index, Columns: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String): scala.Unit = js.native
  def Append(Item: java.lang.String, Columns: activexDashInteropLib.SafeArray[java.lang.String]): scala.Unit = js.native
  def Append(Item: java.lang.String, Columns: java.lang.String): scala.Unit = js.native
  def Delete(Item: java.lang.String): scala.Unit = js.native
  def Delete(Item: scala.Double): scala.Unit = js.native
  def Item(Item: java.lang.String): Index = js.native
  def Item(Item: scala.Double): Index = js.native
  def Refresh(): scala.Unit = js.native
}

