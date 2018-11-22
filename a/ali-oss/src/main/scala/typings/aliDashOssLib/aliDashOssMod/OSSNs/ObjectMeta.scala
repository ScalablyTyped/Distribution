package typings
package aliDashOssLib.aliDashOssMod.OSSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ObjectMeta extends js.Object {
   // object last modified GMT date, e.g.: 2015-02-19T08:39:44.000Z
  var etag: java.lang.String
   // object name on oss
  var lastModified: java.lang.String
  var name: java.lang.String
  var owner: OwnerType
   // object type, e.g.: Normal
  var size: scala.Double
   // object size, e.g.: 344606
  var storageClass: StorageType
   // object etag contains ", e.g.: "5B3C1A2E053D763E1B002CC607C5A0FE"
  var `type`: java.lang.String
}

