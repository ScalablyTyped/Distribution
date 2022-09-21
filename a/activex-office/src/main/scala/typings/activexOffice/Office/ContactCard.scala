package typings.activexOffice.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactCard extends StObject {
  
  val Application: Any = js.native
  
  def Close(): Unit = js.native
  
  val Creator: Double = js.native
  
  /* private */ @JSName("Office.ContactCard_typekey")
  var OfficeDotContactCard_typekey: ContactCard = js.native
  
  /** @param boolean [ShowWithDelay=false] */
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: Double,
    RectangleRight: Double,
    RectangleTop: Double,
    RectangleBottom: Double,
    HorizontalPosition: Double
  ): Unit = js.native
  def Show(
    CardStyle: MsoContactCardStyle,
    RectangleLeft: Double,
    RectangleRight: Double,
    RectangleTop: Double,
    RectangleBottom: Double,
    HorizontalPosition: Double,
    ShowWithDelay: Boolean
  ): Unit = js.native
}
