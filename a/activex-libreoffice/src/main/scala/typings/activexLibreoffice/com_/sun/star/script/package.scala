package typings.activexLibreoffice.com_.sun.star

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object script {
  
  /** makes it possible to generate the adapters from specific interfaces to the interface {@link XAllListener} . */
  type AllListenerAdapter = typings.activexLibreoffice.com_.sun.star.script.XAllListenerAdapterService
  
  /**
    * is thrown by an attacher if an adapter service cannot create the appropriate adapter.
    * @see com.sun.star.script.XAllListenerAdapterService
    * @see com.sun.star.script.XEventAttacher
    * @see com.sun.star.script.XEventAttacherManager
    */
  type CannotCreateAdapterException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * This service provides a widening converter converting from one type to another, if possible.
    *
    * What is possible? byte: byte, (short *1), (long *1), (hyper *1), (float *1), (double *1), (enum *2), (any *3), boolean, (char *4), (string *5)short:
    * byte, short, (long *1), (hyper *1), (float *7), (double *7), (enum *2), (any *3), boolean, char, (string *5)long: byte, short, long, (hyper *1),
    * (float *7), (double *7), enum, (any *3), boolean, char, (string *5)hyper: byte, short, long, hyper, (float *7), (double *7), enum, (any *3), boolean,
    * char, (string *5)float: byte, short, long, hyper, float, (double *7), (enum *8), (any *3), boolean, char, (string *5)double: byte, short, long, hyper,
    * float, double, enum, (any *3), boolean, char, (string *5)enum: (byte *9), (short *9), (long *9), (hyper *9), (float *9), (double *9), (enum *10), (any
    * *3), (string *11)void: ok for all typesany: ok for all typesboolean: byte, short, long, hyper, float, double, (any *3), boolean, char, (string *12). 0
    * => false, != 0 => truechar: byte, short, (long *1), (hyper *1), (float *7), (double *7), enum, (any *3), boolean, char, (string *13)string: byte,
    * short, long, hyper, float, double, enum, (any *3), boolean, char, stringstruct: (any *3), (struct *14)interface: (any *3), (struct *14)exception: (any
    * *3), (exception *14)union: (any *3), (union *14)sequence: (any *3), (sequence *15) rules: 1: only converts if the value is in the range of the target
    * type.2: only converts if the value, not the position, of the enum is in the range of the target type.3: get value until it is not an any. Then convert
    * it with the other rules.4: only converts if the value of the character is between 0 - 255.5: only converts if the value represents a decimal,
    * hexadecimal (0x...) or a floating point number. Examples: 10, 0x10, 10.045, 10,555, +10, +10.6e10, -10.6e-10, .16.7: only converts if the value is in
    * the range of the target type. The value is rounded to an integer.8: only converts if the float can be converted back to the same enum value.9: only
    * converts if the number is one of the enumeration type values. Normally you need reflection information of the enum type.10: only converts if it is the
    * same enumeration type.11: only converts if the string contains the name of an enumeration type value. Normally you need core reflection information of
    * the enum type.12: only converts if the value of the string is "1", "true" or "0", "false". The comparison is case insensitive.13: only converts if the
    * length of the string is 1 or 0.14: only converts if the types are equal or the source type is derived from the destination type.15: only converts if
    * each element of the source sequence can be converted to an element of the destination sequence.
    */
  type Converter = typings.activexLibreoffice.com_.sun.star.script.XTypeConverter
  
  /**
    * service that any scripting engine must implement.
    *
    * The implementation of this interface should supply the interfaces com.sun.star.script.XDebugging2 and interface {@link
    * com.sun.star.script.XInvocation} .
    * @deprecated Deprecated
    */
  type Engine = typings.activexLibreoffice.com_.sun.star.script.XEngine
  
  /**
    * factory service that allows construction of {@link Invocation} objects.
    *
    * Invoke {@link createInstanceWithArguments()} of XSingleServiceFactory to create an {@link Invocation} adapter for the passed object (Invoking {@link
    * createInstance()} will fail).
    *
    * The adapter has to support {@link com.sun.star.script.XInvocation} . The adapter may also support {@link com.sun.star.script.XInvocation2} .
    */
  type Invocation = typings.activexLibreoffice.com_.sun.star.lang.XSingleServiceFactory
  
  /**
    * Provides functionality to create an adapter that supports (a) special interface type(s) and maps calls to the interface's methods to an invocation
    * interface.
    *
    * An adapter like this allows generic dispatch interfaces to meet interface requirements, e.g. if a specific listener interface has to be passed to an
    * add...Listener method.
    *
    * The adapter has to support {@link com.sun.star.script.XInvocationAdapterFactory} . The adapter may also support {@link
    * com.sun.star.script.XInvocationAdapterFactory2} .
    */
  type InvocationAdapterFactory = typings.activexLibreoffice.com_.sun.star.script.XInvocationAdapterFactory2
  
  /**
    * service is implementation of a {@link JavaScript} interpreter.
    *
    * The interpreter should be similar to {@link JavaScript} 1.1. The exact behavior will be specified in future.
    * @deprecated Deprecated
    */
  type JavaScript = typings.activexLibreoffice.com_.sun.star.script.Engine
  
  /**
    * is thrown when an operation on a unloaded library is attempted which requires the library being loaded.
    * @since OOo 3.0
    */
  type LibraryNotLoadedException = typings.activexLibreoffice.com_.sun.star.uno.Exception
  
  /**
    * Provides documentation for UNO services
    * @since LibreOffice 5.1
    */
  type theServiceDocumenter = typings.activexLibreoffice.com_.sun.star.script.XServiceDocumenter
}
