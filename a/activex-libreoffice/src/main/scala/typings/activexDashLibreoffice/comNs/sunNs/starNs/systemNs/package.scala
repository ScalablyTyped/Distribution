package typings.activexDashLibreoffice.comNs.sunNs.starNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object systemNs {
  /**
    * Specifies a {@link SimpleCommandMail} service. Implementations of such a service, do implement an interface to send mail messages via the current
    * configured command line mail application.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleCommandMail = XSimpleMailClientSupplier
  /**
    * Specifies a {@link SimpleSystemMail} service. Implementations of such a service implement an interface to send mail messages via the currently
    * configured system mail client.
    * @see com.sun.star.system.XSimpleMailClient
    */
  type SimpleSystemMail = XSimpleMailClientSupplier
  /**
    * Specifies a system executer service. Such a service makes it possible to execute an arbitrary system command.
    * @see com.sun.star.system.XSystemShellExecute
    */
  type SystemShellExecute = XSystemShellExecute
}
