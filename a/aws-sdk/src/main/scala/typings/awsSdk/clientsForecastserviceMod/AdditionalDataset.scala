package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdditionalDataset extends StObject {
  
  /**
    *  Weather Index  To enable the Weather Index, do not specify a value for Configuration.  Holidays   Holidays  To enable Holidays, set CountryCode to one of the following two-letter country codes:   "AL" - ALBANIA   "AR" - ARGENTINA   "AT" - AUSTRIA   "AU" - AUSTRALIA   "BA" - BOSNIA HERZEGOVINA   "BE" - BELGIUM   "BG" - BULGARIA   "BO" - BOLIVIA   "BR" - BRAZIL   "BY" - BELARUS   "CA" - CANADA   "CL" - CHILE   "CO" - COLOMBIA   "CR" - COSTA RICA   "HR" - CROATIA   "CZ" - CZECH REPUBLIC   "DK" - DENMARK   "EC" - ECUADOR   "EE" - ESTONIA   "ET" - ETHIOPIA   "FI" - FINLAND   "FR" - FRANCE   "DE" - GERMANY   "GR" - GREECE   "HU" - HUNGARY   "IS" - ICELAND   "IN" - INDIA   "IE" - IRELAND   "IT" - ITALY   "JP" - JAPAN   "KZ" - KAZAKHSTAN   "KR" - KOREA   "LV" - LATVIA   "LI" - LIECHTENSTEIN   "LT" - LITHUANIA   "LU" - LUXEMBOURG   "MK" - MACEDONIA   "MT" - MALTA   "MX" - MEXICO   "MD" - MOLDOVA   "ME" - MONTENEGRO   "NL" - NETHERLANDS   "NZ" - NEW ZEALAND   "NI" - NICARAGUA   "NG" - NIGERIA   "NO" - NORWAY   "PA" - PANAMA   "PY" - PARAGUAY   "PE" - PERU   "PL" - POLAND   "PT" - PORTUGAL   "RO" - ROMANIA   "RU" - RUSSIA   "RS" - SERBIA   "SK" - SLOVAKIA   "SI" - SLOVENIA   "ZA" - SOUTH AFRICA   "ES" - SPAIN   "SE" - SWEDEN   "CH" - SWITZERLAND   "UA" - UKRAINE   "AE" - UNITED ARAB EMIRATES   "US" - UNITED STATES   "UK" - UNITED KINGDOM   "UY" - URUGUAY   "VE" - VENEZUELA  
    */
  var Configuration: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Configuration] = js.undefined
  
  /**
    * The name of the additional dataset. Valid names: "holiday" and "weather".
    */
  var Name: typings.awsSdk.clientsForecastserviceMod.Name
}
object AdditionalDataset {
  
  inline def apply(Name: Name): AdditionalDataset = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdditionalDataset]
  }
  
  extension [Self <: AdditionalDataset](x: Self) {
    
    inline def setConfiguration(value: Configuration): Self = StObject.set(x, "Configuration", value.asInstanceOf[js.Any])
    
    inline def setConfigurationUndefined: Self = StObject.set(x, "Configuration", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
