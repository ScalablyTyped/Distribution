package typings.activexDashLibreoffice.comNs.sunNs.starNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.DeploymentException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object javaNs {
  /**
    * indicates a the Java settings have been modified.
    *
    * The Java framework uses a configuration file, which can be used by distributors to determine what versions are supported. If this file is modified,
    * then the current settings are regarded as invalid.
    * @since OOo 2.0
    */
  type InvalidJavaSettingsException = JavaInitializationException
  /**
    * indicates that Java could not be initialized because it has been switched off.
    *
    * The user has switched off Java in the configuration of the office, for example by means of the options dialog.
    * @since OOo 1.1.2
    */
  type JavaDisabledException = JavaInitializationException
  /**
    * indicates that there is no Java available
    *
    * It is presumed that Java is a vital part of an office installation. That is, if Java does work for some reason, it is not guaranteed that the office
    * is functional. A {@link JavaInitializationException} is therefore caused by some misconfiguration of Java which is closer described by other
    * exceptions in this namespace which inherit {@link JavaInitializationException} . These are:
    *
    * {@link com.sun.star.java.JavaDisabledException}; {@link com.sun.star.java.JavaNotConfiguredException}; {@link
    * com.sun.star.java.MissingJavaRuntimeException}; {@link com.sun.star.java.JavaVMCreationFailureException};
    * @since OOo 1.1.2
    */
  type JavaInitializationException = DeploymentException
  /**
    * indicates that the user did not configure Java for an Office installation.
    *
    * This exception occurs if there is no java.ini or javarc available. This usually happens if a user cancels the Java configuration which of the office.
    * @since OOo 1.1.2
    */
  type JavaNotConfiguredException = JavaInitializationException
  /**
    * indicates that no suitable JRE was found.
    * @since OOo 2.0
    */
  type JavaNotFoundException = JavaInitializationException
  /**
    * Exports interfaces to handle a Java VM.
    * @deprecated DeprecatedA UNO service seems to be at the wrong abstraction level for this functionality. This should probably be replaced by an appropriate C/C
    */
  type JavaVirtualMachine = XJavaVM
  /**
    * indicates that the office must be restarted before a JRE can be used.
    * @since OOo 2.0
    */
  type RestartRequiredException = JavaInitializationException
}
