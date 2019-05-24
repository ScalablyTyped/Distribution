package typings
package addressLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("address", JSImport.Namespace)
@js.native
object addressMod extends js.Object {
  def apply(callback: js.Function2[/* err */ stdLib.Error, /* addr */ addressLib.Anon_Ip, scala.Unit]): scala.Unit = js.native
  def apply(
    interfaceName: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addr */ addressLib.Anon_Ip, scala.Unit]
  ): scala.Unit = js.native
  def dns(
    callback: js.Function2[/* err */ stdLib.Error, /* servers */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def dns(
    filePath: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* servers */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit = js.native
  def ip(): java.lang.String = js.native
  def ip(interfaceName: java.lang.String): java.lang.String = js.native
  def ipv6(): java.lang.String = js.native
  def ipv6(interfaceName: java.lang.String): java.lang.String = js.native
  def mac(callback: js.Function2[/* err */ stdLib.Error, /* addr */ java.lang.String, scala.Unit]): scala.Unit = js.native
  def mac(
    interfaceName: java.lang.String,
    callback: js.Function2[/* err */ stdLib.Error, /* addr */ java.lang.String, scala.Unit]
  ): scala.Unit = js.native
}

