package typings.appBuilderLib.integrityMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsarIntegrity extends AsarIntegrityOptions {
  var checksums: StringDictionary[String] = js.native
}

object AsarIntegrity {
  @scala.inline
  def apply(checksums: StringDictionary[String]): AsarIntegrity = {
    val __obj = js.Dynamic.literal(checksums = checksums.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsarIntegrity]
  }
  @scala.inline
  implicit class AsarIntegrityOps[Self <: AsarIntegrity] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChecksums(value: StringDictionary[String]): Self = this.set("checksums", value.asInstanceOf[js.Any])
  }
  
}

