package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeZone extends StObject {
  
  val Application: typings.activexOutlook.Outlook.Application
  
  val Bias: Double
  
  val Class: OlObjectClass
  
  val DaylightBias: Double
  
  val DaylightDate: VarDate
  
  val DaylightDesignation: String
  
  val ID: String
  
  val Name: String
  
  /* private */ @JSName("Outlook.TimeZone_typekey")
  var OutlookDotTimeZone_typekey: TimeZone
  
  val Parent: Any
  
  val Session: NameSpace
  
  val StandardBias: Double
  
  val StandardDate: VarDate
  
  val StandardDesignation: String
}
object TimeZone {
  
  inline def apply(
    Application: Application,
    Bias: Double,
    Class: OlObjectClass,
    DaylightBias: Double,
    DaylightDate: VarDate,
    DaylightDesignation: String,
    ID: String,
    Name: String,
    OutlookDotTimeZone_typekey: TimeZone,
    Parent: Any,
    Session: NameSpace,
    StandardBias: Double,
    StandardDate: VarDate,
    StandardDesignation: String
  ): TimeZone = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Bias = Bias.asInstanceOf[js.Any], Class = Class.asInstanceOf[js.Any], DaylightBias = DaylightBias.asInstanceOf[js.Any], DaylightDate = DaylightDate.asInstanceOf[js.Any], DaylightDesignation = DaylightDesignation.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Session = Session.asInstanceOf[js.Any], StandardBias = StandardBias.asInstanceOf[js.Any], StandardDate = StandardDate.asInstanceOf[js.Any], StandardDesignation = StandardDesignation.asInstanceOf[js.Any])
    __obj.updateDynamic("Outlook.TimeZone_typekey")(OutlookDotTimeZone_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeZone]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeZone] (val x: Self) extends AnyVal {
    
    inline def setApplication(value: Application): Self = StObject.set(x, "Application", value.asInstanceOf[js.Any])
    
    inline def setBias(value: Double): Self = StObject.set(x, "Bias", value.asInstanceOf[js.Any])
    
    inline def setClass(value: OlObjectClass): Self = StObject.set(x, "Class", value.asInstanceOf[js.Any])
    
    inline def setDaylightBias(value: Double): Self = StObject.set(x, "DaylightBias", value.asInstanceOf[js.Any])
    
    inline def setDaylightDate(value: VarDate): Self = StObject.set(x, "DaylightDate", value.asInstanceOf[js.Any])
    
    inline def setDaylightDesignation(value: String): Self = StObject.set(x, "DaylightDesignation", value.asInstanceOf[js.Any])
    
    inline def setID(value: String): Self = StObject.set(x, "ID", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOutlookDotTimeZone_typekey(value: TimeZone): Self = StObject.set(x, "Outlook.TimeZone_typekey", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "Parent", value.asInstanceOf[js.Any])
    
    inline def setSession(value: NameSpace): Self = StObject.set(x, "Session", value.asInstanceOf[js.Any])
    
    inline def setStandardBias(value: Double): Self = StObject.set(x, "StandardBias", value.asInstanceOf[js.Any])
    
    inline def setStandardDate(value: VarDate): Self = StObject.set(x, "StandardDate", value.asInstanceOf[js.Any])
    
    inline def setStandardDesignation(value: String): Self = StObject.set(x, "StandardDesignation", value.asInstanceOf[js.Any])
  }
}
