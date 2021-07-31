package typings.activexLibreoffice.com_.sun.star

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.DeploymentException
import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object java_ {
  
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
    * indicates that the Java Virtual Machine could not be created
    *
    * This exception can be thrown when the creation of the Java Virtual Machine failed, even if the runtime library could be loaded. Possible reasons for a
    * failure are that JNI_CreateJavaVM returns an error code that reflects a failure, JNI_CreateJavaVM does not return because it tries to quit the process
    * ( _exit), the shared library is corrupted, so that the symbols for JNI_GetDefaultVMInitArgs or JNI_CreateJavaVM cannot be found, etc.
    * @since OOo 1.1.2
    */
  trait JavaVMCreationFailureException
    extends StObject
       with Exception {
    
    /**
      * contains an error code that reflects the returned error code of JNI_CreateJavaVM or other errors. A negative value represents the returned error code
      * of JNI_CreateJavaVM. All other values indicate a different cause.
      */
    var ErrorCode: Double
  }
  object JavaVMCreationFailureException {
    
    @scala.inline
    def apply(Context: XInterface, ErrorCode: Double, Message: String): JavaVMCreationFailureException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[JavaVMCreationFailureException]
    }
    
    @scala.inline
    implicit class JavaVMCreationFailureExceptionMutableBuilder[Self <: JavaVMCreationFailureException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Exports interfaces to handle a Java VM.
    * @deprecated DeprecatedA UNO service seems to be at the wrong abstraction level for this functionality. This should probably be replaced by an appropriate C/C
    */
  type JavaVirtualMachine = XJavaVM
  
  /**
    * indicates that the Java runtime library could not be found.
    *
    * This happens when a user moves or deletes a Java installation after the office has been configured to use that Java installation.
    * @since OOo 1.1.2
    */
  trait MissingJavaRuntimeException
    extends StObject
       with Exception {
    
    /** contains the path to the runtime lib as file URL. */
    var URLRuntimeLib: String
  }
  object MissingJavaRuntimeException {
    
    @scala.inline
    def apply(Context: XInterface, Message: String, URLRuntimeLib: String): MissingJavaRuntimeException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], URLRuntimeLib = URLRuntimeLib.asInstanceOf[js.Any])
      __obj.asInstanceOf[MissingJavaRuntimeException]
    }
    
    @scala.inline
    implicit class MissingJavaRuntimeExceptionMutableBuilder[Self <: MissingJavaRuntimeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setURLRuntimeLib(value: String): Self = StObject.set(x, "URLRuntimeLib", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * indicates that the office must be restarted before a JRE can be used.
    * @since OOo 2.0
    */
  type RestartRequiredException = JavaInitializationException
  
  /** indicates that an operation involving Java (probably executing Java code) failed due to a wrong Java version. */
  trait WrongJavaVersionException
    extends StObject
       with Exception {
    
    /** contains the Java version that has been detected, or is left empty if this is unknown. */
    var DetectedVersion: String
    
    /** contains the highest Java version for which the operation would succeed, or is left empty if this is unknown. */
    var HighestSupportedVersion: String
    
    /** contains the lowest Java version for which the operation would succeed, or is left empty if this is unknown. */
    var LowestSupportedVersion: String
  }
  object WrongJavaVersionException {
    
    @scala.inline
    def apply(
      Context: XInterface,
      DetectedVersion: String,
      HighestSupportedVersion: String,
      LowestSupportedVersion: String,
      Message: String
    ): WrongJavaVersionException = {
      val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], DetectedVersion = DetectedVersion.asInstanceOf[js.Any], HighestSupportedVersion = HighestSupportedVersion.asInstanceOf[js.Any], LowestSupportedVersion = LowestSupportedVersion.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
      __obj.asInstanceOf[WrongJavaVersionException]
    }
    
    @scala.inline
    implicit class WrongJavaVersionExceptionMutableBuilder[Self <: WrongJavaVersionException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetectedVersion(value: String): Self = StObject.set(x, "DetectedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighestSupportedVersion(value: String): Self = StObject.set(x, "HighestSupportedVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowestSupportedVersion(value: String): Self = StObject.set(x, "LowestSupportedVersion", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * must be implemented by the user of the {@link XJavaThreadRegister_11} .
    * @deprecated Deprecated
    */
  trait XJavaThreadRegister11
    extends StObject
       with XInterface {
    
    /** returns `TRUE` if the current thread is already attached to the VM otherwise `FALSE` . */
    def isThreadAttached(): Boolean
    
    /**
      * registers the current thread.
      *
      * This method should be called every time a JNI function is called from Java.
      */
    def registerThread(): Unit
    
    /**
      * revokes the current thread from the list of registered threads.
      *
      * This method should be called at the end of every JNI call from Java.
      */
    def revokeThread(): Unit
  }
  object XJavaThreadRegister11 {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      isThreadAttached: () => Boolean,
      queryInterface: `type` => js.Any,
      registerThread: () => Unit,
      release: () => Unit,
      revokeThread: () => Unit
    ): XJavaThreadRegister11 = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), isThreadAttached = js.Any.fromFunction0(isThreadAttached), queryInterface = js.Any.fromFunction1(queryInterface), registerThread = js.Any.fromFunction0(registerThread), release = js.Any.fromFunction0(release), revokeThread = js.Any.fromFunction0(revokeThread))
      __obj.asInstanceOf[XJavaThreadRegister11]
    }
    
    @scala.inline
    implicit class XJavaThreadRegister11MutableBuilder[Self <: XJavaThreadRegister11] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsThreadAttached(value: () => Boolean): Self = StObject.set(x, "isThreadAttached", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRegisterThread(value: () => Unit): Self = StObject.set(x, "registerThread", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRevokeThread(value: () => Unit): Self = StObject.set(x, "revokeThread", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * must be implemented by the user of the {@link XJavaVM} .
    * @deprecated DeprecatedA UNO interface seems to be at the wrong abstraction level for this functionality (also, the C++ classes jvmaccess::VirtualMachine and
    */
  trait XJavaVM
    extends StObject
       with XInterface {
    
    /**
      * returns the address of the Java Virtual Machine.
      *
      * If the VM is not already instantiated, it will be now.
      *
      * If the `processID` is a normal 16-byte ID, the returned `any` contains a JNI `JavaVM` pointer as a `long` or `hyper` integer (depending on the
      * platform). If the `processID` does not match the current process, or if the VM cannot be instantiated for whatever reason, a `VOID``any` is returned.
      *
      * If the `processID` has an additional 17th byte of value  `0` , the returned `any` contains a non  -  reference-counted pointer to a
      * (reference-counted) instance of the C++ `jvmaccess::VirtualMachine` class, always represented as a `hyper` integer. The pointer is guaranteed to be
      * valid as long as the reference to this {@link com.sun.star.java.XJavaVM} is valid (but the pointer should be converted into a reference-counted
      * reference as soon as possible). Again, if the first 16 bytes of the `processID` do not match the current process, or if the VM cannot be instantiated
      * for whatever reason, a `VOID``any` is returned.
      *
      * If the `processID` has an additional 17th byte of value  `1` , the returned `any` contains a non  -  reference-counted pointer to a
      * (reference-counted) instance of the C++ `jvmaccess::UnoVirtualMachine` class, always represented as a `hyper` integer. The pointer is guaranteed to be
      * valid as long as the reference to this {@link com.sun.star.java.XJavaVM} is valid. Again, if the first 16 bytes of the `processID` do not match the
      * current process, or if the VM cannot be instantiated for whatever reason, a `VOID``any` is returned.
      *
      * The first form (returning a JNI `JavaVM` pointer) is mainly for backwards compatibility, new code should use the second form (returning a pointer to a
      * `jvmaccess::VirtualMachine` ) if it does not want to use the Java UNO environment, and it should use the third form (returning a pointer to a
      * `jvmaccess::UnoVirtualMachine` ) if it wants to use the Java UNO environment. For example, one advantage of using `jvmaccess::VirtualMachine` instead
      * of the raw `JavaVM` pointer is that whenever you attach a native thread to the Java virtual machine, that thread's context `ClassLoader` (see
      * `java.lang.Thread.getContextClassLoader` ) will automatically be set to a meaningful value.
      * @param processID The process ID of the caller's process, possibly extended by a 17th byte of value `0` or  `1` .
      * @returns On success, the `any` contains a pointer represented as `long` or `hyper` , otherwise the `any` is `VOID` .
      */
    def getJavaVM(processID: SeqEquiv[Double]): js.Any
    
    /**
      * Returns `TRUE` if the VM is enabled.
      *
      * It is only possible to get the VM, if this method return 0.
      */
    def isVMEnabled(): Boolean
    
    /** returns `TRUE` if the VM is started successfully, otherwise `FALSE` . */
    def isVMStarted(): Boolean
  }
  object XJavaVM {
    
    @scala.inline
    def apply(
      acquire: () => Unit,
      getJavaVM: SeqEquiv[Double] => js.Any,
      isVMEnabled: () => Boolean,
      isVMStarted: () => Boolean,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XJavaVM = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getJavaVM = js.Any.fromFunction1(getJavaVM), isVMEnabled = js.Any.fromFunction0(isVMEnabled), isVMStarted = js.Any.fromFunction0(isVMStarted), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XJavaVM]
    }
    
    @scala.inline
    implicit class XJavaVMMutableBuilder[Self <: XJavaVM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetJavaVM(value: SeqEquiv[Double] => js.Any): Self = StObject.set(x, "getJavaVM", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsVMEnabled(value: () => Boolean): Self = StObject.set(x, "isVMEnabled", js.Any.fromFunction0(value))
      
      @scala.inline
      def setIsVMStarted(value: () => Boolean): Self = StObject.set(x, "isVMStarted", js.Any.fromFunction0(value))
    }
  }
}
