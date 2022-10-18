package typings.awsSdk.clientsHoneycodeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cell extends StObject {
  
  /**
    * The format of the cell. If this field is empty, then the format is either not specified in the workbook or the format is set to AUTO.
    */
  var format: js.UndefOr[Format] = js.undefined
  
  /**
    *  The formatted value of the cell. This is the value that you see displayed in the cell in the UI.   Note that the formatted value of a cell is always represented as a string irrespective of the data that is stored in the cell. For example, if a cell contains a date, the formatted value of the cell is the string representation of the formatted date being shown in the cell in the UI. See details in the rawValue field below for how cells of different formats will have different raw and formatted values. 
    */
  var formattedValue: js.UndefOr[FormattedValue] = js.undefined
  
  /**
    *  A list of formatted values of the cell. This field is only returned when the cell is ROWSET format (aka multi-select or multi-record picklist). Values in the list are always represented as strings. The formattedValue field will be empty if this field is returned. 
    */
  var formattedValues: js.UndefOr[FormattedValuesList] = js.undefined
  
  /**
    *  The formula contained in the cell. This field is empty if a cell does not have a formula. 
    */
  var formula: js.UndefOr[Formula] = js.undefined
  
  /**
    *  The raw value of the data contained in the cell. The raw value depends on the format of the data in the cell. However the attribute in the API return value is always a string containing the raw value.   Cells with format DATE, DATE_TIME or TIME have the raw value as a floating point number where the whole number represents the number of days since 1/1/1900 and the fractional part represents the fraction of the day since midnight. For example, a cell with date 11/3/2020 has the raw value "44138". A cell with the time 9:00 AM has the raw value "0.375" and a cell with date/time value of 11/3/2020 9:00 AM has the raw value "44138.375". Notice that even though the raw value is a number in all three cases, it is still represented as a string.   Cells with format NUMBER, CURRENCY, PERCENTAGE and ACCOUNTING have the raw value of the data as the number representing the data being displayed. For example, the number 1.325 with two decimal places in the format will have it's raw value as "1.325" and formatted value as "1.33". A currency value for $10 will have the raw value as "10" and formatted value as "$10.00". A value representing 20% with two decimal places in the format will have its raw value as "0.2" and the formatted value as "20.00%". An accounting value of -$25 will have "-25" as the raw value and "$ (25.00)" as the formatted value.   Cells with format TEXT will have the raw text as the raw value. For example, a cell with text "John Smith" will have "John Smith" as both the raw value and the formatted value.   Cells with format CONTACT will have the name of the contact as a formatted value and the email address of the contact as the raw value. For example, a contact for John Smith will have "John Smith" as the formatted value and "john.smith@example.com" as the raw value.   Cells with format ROWLINK (aka picklist) will have the first column of the linked row as the formatted value and the row id of the linked row as the raw value. For example, a cell containing a picklist to a table that displays task status might have "Completed" as the formatted value and "row:dfcefaee-5b37-4355-8f28-40c3e4ff5dd4/ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.   Cells with format ROWSET (aka multi-select or multi-record picklist) will by default have the first column of each of the linked rows as the formatted value in the list, and the rowset id of the linked rows as the raw value. For example, a cell containing a multi-select picklist to a table that contains items might have "Item A", "Item B" in the formatted value list and "rows:b742c1f4-6cb0-4650-a845-35eb86fcc2bb/ [fdea123b-8f68-474a-aa8a-5ff87aa333af,6daf41f0-a138-4eee-89da-123086d36ecf]" as the raw value.   Cells with format ATTACHMENT will have the name of the attachment as the formatted value and the attachment id as the raw value. For example, a cell containing an attachment named "image.jpeg" will have "image.jpeg" as the formatted value and "attachment:ca432b2f-b8eb-431d-9fb5-cbe0342f9f03" as the raw value.   Cells with format AUTO or cells without any format that are auto-detected as one of the formats above will contain the raw and formatted values as mentioned above, based on the auto-detected formats. If there is no auto-detected format, the raw and formatted values will be the same as the data in the cell. 
    */
  var rawValue: js.UndefOr[RawValue] = js.undefined
}
object Cell {
  
  inline def apply(): Cell = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cell]
  }
  
  extension [Self <: Cell](x: Self) {
    
    inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormattedValue(value: FormattedValue): Self = StObject.set(x, "formattedValue", value.asInstanceOf[js.Any])
    
    inline def setFormattedValueUndefined: Self = StObject.set(x, "formattedValue", js.undefined)
    
    inline def setFormattedValues(value: FormattedValuesList): Self = StObject.set(x, "formattedValues", value.asInstanceOf[js.Any])
    
    inline def setFormattedValuesUndefined: Self = StObject.set(x, "formattedValues", js.undefined)
    
    inline def setFormattedValuesVarargs(value: FormattedValue*): Self = StObject.set(x, "formattedValues", js.Array(value*))
    
    inline def setFormula(value: Formula): Self = StObject.set(x, "formula", value.asInstanceOf[js.Any])
    
    inline def setFormulaUndefined: Self = StObject.set(x, "formula", js.undefined)
    
    inline def setRawValue(value: RawValue): Self = StObject.set(x, "rawValue", value.asInstanceOf[js.Any])
    
    inline def setRawValueUndefined: Self = StObject.set(x, "rawValue", js.undefined)
  }
}
