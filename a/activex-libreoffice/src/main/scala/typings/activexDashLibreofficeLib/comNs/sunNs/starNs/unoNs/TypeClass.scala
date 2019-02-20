package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TypeClass extends js.Object

/**
  * This enum describes all type classes of UNO. Every specific type has a type class specifying the general context of the reflected type.
  *
  * Example: A type reflecting the interface {@link XInterface} is of type class INTERFACE and its name is "com.sun.star.uno.XInterface".
  */
@JSGlobal("com.sun.star.uno.TypeClass")
@js.native
object TypeClass extends js.Object {
  /** reflecting the any type; anys can carry any UNO value except of any values */
  @js.native
  sealed trait ANY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /**
    * Deprecated, UNOIDL does not have an array concept.
    * @deprecated Deprecated
    */
  @js.native
  sealed trait ARRAY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the boolean type; true and false */
  @js.native
  sealed trait BOOLEAN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the 8-bit ordinal type */
  @js.native
  sealed trait BYTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the 16-bit unicode character type */
  @js.native
  sealed trait CHAR
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting constants */
  @js.native
  sealed trait CONSTANT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting constants groups */
  @js.native
  sealed trait CONSTANTS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the 64-bit floating point type */
  @js.native
  sealed trait DOUBLE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting enum types */
  @js.native
  sealed trait ENUM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting exception types */
  @js.native
  sealed trait EXCEPTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the 32-bit floating point type */
  @js.native
  sealed trait FLOAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the signed 64-bit ordinal type */
  @js.native
  sealed trait HYPER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting interface types */
  @js.native
  sealed trait INTERFACE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting interface attributes */
  @js.native
  sealed trait INTERFACE_ATTRIBUTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting interface methods */
  @js.native
  sealed trait INTERFACE_METHOD
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the signed 32-bit ordinal type */
  @js.native
  sealed trait LONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting modules */
  @js.native
  sealed trait MODULE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting properties */
  @js.native
  sealed trait PROPERTY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting sequence types */
  @js.native
  sealed trait SEQUENCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting services */
  @js.native
  sealed trait SERVICE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the signed 16-bit ordinal type */
  @js.native
  sealed trait SHORT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting singletons */
  @js.native
  sealed trait SINGLETON
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the string type; strings of unicode characters */
  @js.native
  sealed trait STRING
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting compound types */
  @js.native
  sealed trait STRUCT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the meta type */
  @js.native
  sealed trait TYPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting typedefed types referencing other types */
  @js.native
  sealed trait TYPEDEF
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /**
    * Deprecated, UNOIDL does not have a union concept.
    * @deprecated Deprecated
    */
  @js.native
  sealed trait UNION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the unreflectable type */
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the unsigned 64-bit ordinal type */
  @js.native
  sealed trait UNSIGNED_HYPER
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the unsigned 32-bit type */
  @js.native
  sealed trait UNSIGNED_LONG
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the unsigned 16-bit ordinal type */
  @js.native
  sealed trait UNSIGNED_SHORT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /** reflecting the void type; denotes no type */
  @js.native
  sealed trait VOID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass
  
  /* 14 */ val ANY: ANY with scala.Double = js.native
  /* 21 */ val ARRAY: ARRAY with scala.Double = js.native
  /* 2 */ val BOOLEAN: BOOLEAN with scala.Double = js.native
  /* 3 */ val BYTE: BYTE with scala.Double = js.native
  /* 1 */ val CHAR: CHAR with scala.Double = js.native
  /* 29 */ val CONSTANT: CONSTANT with scala.Double = js.native
  /* 30 */ val CONSTANTS: CONSTANTS with scala.Double = js.native
  /* 11 */ val DOUBLE: DOUBLE with scala.Double = js.native
  /* 15 */ val ENUM: ENUM with scala.Double = js.native
  /* 19 */ val EXCEPTION: EXCEPTION with scala.Double = js.native
  /* 10 */ val FLOAT: FLOAT with scala.Double = js.native
  /* 8 */ val HYPER: HYPER with scala.Double = js.native
  /* 22 */ val INTERFACE: INTERFACE with scala.Double = js.native
  /* 26 */ val INTERFACE_ATTRIBUTE: INTERFACE_ATTRIBUTE with scala.Double = js.native
  /* 25 */ val INTERFACE_METHOD: INTERFACE_METHOD with scala.Double = js.native
  /* 6 */ val LONG: LONG with scala.Double = js.native
  /* 24 */ val MODULE: MODULE with scala.Double = js.native
  /* 28 */ val PROPERTY: PROPERTY with scala.Double = js.native
  /* 20 */ val SEQUENCE: SEQUENCE with scala.Double = js.native
  /* 23 */ val SERVICE: SERVICE with scala.Double = js.native
  /* 4 */ val SHORT: SHORT with scala.Double = js.native
  /* 31 */ val SINGLETON: SINGLETON with scala.Double = js.native
  /* 12 */ val STRING: STRING with scala.Double = js.native
  /* 17 */ val STRUCT: STRUCT with scala.Double = js.native
  /* 13 */ val TYPE: TYPE with scala.Double = js.native
  /* 16 */ val TYPEDEF: TYPEDEF with scala.Double = js.native
  /* 18 */ val UNION: UNION with scala.Double = js.native
  /* 27 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  /* 9 */ val UNSIGNED_HYPER: UNSIGNED_HYPER with scala.Double = js.native
  /* 7 */ val UNSIGNED_LONG: UNSIGNED_LONG with scala.Double = js.native
  /* 5 */ val UNSIGNED_SHORT: UNSIGNED_SHORT with scala.Double = js.native
  /* 0 */ val VOID: VOID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.TypeClass with scala.Double] = js.native
}

