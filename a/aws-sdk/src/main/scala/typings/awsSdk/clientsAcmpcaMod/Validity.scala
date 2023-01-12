package typings.awsSdk.clientsAcmpcaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Validity extends StObject {
  
  /**
    * Determines how ACM Private CA interprets the Value parameter, an integer. Supported validity types include those listed below. Type definitions with values include a sample input value and the resulting output.   END_DATE: The specific date and time when the certificate will expire, expressed using UTCTime (YYMMDDHHMMSS) or GeneralizedTime (YYYYMMDDHHMMSS) format. When UTCTime is used, if the year field (YY) is greater than or equal to 50, the year is interpreted as 19YY. If the year field is less than 50, the year is interpreted as 20YY.   Sample input value: 491231235959 (UTCTime format)   Output expiration date/time: 12/31/2049 23:59:59    ABSOLUTE: The specific date and time when the validity of a certificate will start or expire, expressed in seconds since the Unix Epoch.    Sample input value: 2524608000   Output expiration date/time: 01/01/2050 00:00:00    DAYS, MONTHS, YEARS: The relative time from the moment of issuance until the certificate will expire, expressed in days, months, or years.  Example if DAYS, issued on 10/12/2020 at 12:34:54 UTC:   Sample input value: 90   Output expiration date: 01/10/2020 12:34:54 UTC   The minimum validity duration for a certificate using relative time (DAYS) is one day. The minimum validity for a certificate using absolute time (ABSOLUTE or END_DATE) is one second.
    */
  var Type: ValidityPeriodType
  
  /**
    * A long integer interpreted according to the value of Type, below.
    */
  var Value: PositiveLong
}
object Validity {
  
  inline def apply(Type: ValidityPeriodType, Value: PositiveLong): Validity = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Validity]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Validity] (val x: Self) extends AnyVal {
    
    inline def setType(value: ValidityPeriodType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: PositiveLong): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
