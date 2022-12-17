package typings.asn1js.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.asn1js.mod._AsnSchemaType because Already inherited
- typings.asn1js.mod._AsnType because Already inherited */ @JSImport("asn1js", "UTCTime")
@js.native
open class UTCTime ()
  extends VisibleString
     with IUTCTime
     with IDateConvertible {
  def this(param0: UTCTimeParams) = this()
  
  /* CompleteClass */
  var day: Double = js.native
  
  /**
    * Creates a class object from the JavaScript Date object
    * @param date Date object
    */
  /* CompleteClass */
  override def fromDate(date: js.Date): Unit = js.native
  
  /* CompleteClass */
  var hour: Double = js.native
  
  /* CompleteClass */
  var minute: Double = js.native
  
  /* CompleteClass */
  var month: Double = js.native
  
  /* CompleteClass */
  var second: Double = js.native
  
  /**
    * Function converting ASN.1 internal string into ArrayBuffer
    * @returns
    */
  def toBuffer(): js.typedarray.ArrayBuffer = js.native
  
  /**
    * Converts a class object into the JavaScrip Date Object
    * @returns Date object
    */
  /* CompleteClass */
  override def toDate(): js.Date = js.native
  
  def toString(encoding: DateStringEncoding): String = js.native
  
  /* CompleteClass */
  var year: Double = js.native
}
object UTCTime {
  
  @JSImport("asn1js", "UTCTime")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("asn1js", "UTCTime.NAME")
  @js.native
  def NAME: String = js.native
  inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
}
