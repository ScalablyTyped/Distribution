package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsIotdataMod {
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type JsonDocument = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type Payload = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
  type Qos = scala.Double
  type ThingName = java.lang.String
  type Topic = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2015-05-28`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
