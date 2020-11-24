package typings.asyncCsv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CastingContext extends js.Object {
  
  val column: js.UndefOr[Double | String] = js.native
  
  val empty_lines: Double = js.native
  
  val header: Boolean = js.native
  
  val index: Double = js.native
  
  val invalid_field_length: Double = js.native
  
  val lines: Double = js.native
  
  val quoting: Boolean = js.native
  
  val records: Double = js.native
}
object CastingContext {
  
  @scala.inline
  def apply(
    empty_lines: Double,
    header: Boolean,
    index: Double,
    invalid_field_length: Double,
    lines: Double,
    quoting: Boolean,
    records: Double
  ): CastingContext = {
    val __obj = js.Dynamic.literal(empty_lines = empty_lines.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], invalid_field_length = invalid_field_length.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], quoting = quoting.asInstanceOf[js.Any], records = records.asInstanceOf[js.Any])
    __obj.asInstanceOf[CastingContext]
  }
  
  @scala.inline
  implicit class CastingContextOps[Self <: CastingContext] (val x: Self) extends AnyVal {
    
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
    def setEmpty_lines(value: Double): Self = this.set("empty_lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeader(value: Boolean): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvalid_field_length(value: Double): Self = this.set("invalid_field_length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLines(value: Double): Self = this.set("lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuoting(value: Boolean): Self = this.set("quoting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecords(value: Double): Self = this.set("records", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumn(value: Double | String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumn: Self = this.set("column", js.undefined)
  }
}
