package typings.anydbSql.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LOWER extends js.Object {
  
  def LOWER(c: typings.anydbSql.mod.Column[String]): typings.anydbSql.mod.Column[String] = js.native
}
object LOWER {
  
  @scala.inline
  def apply(LOWER: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): LOWER = {
    val __obj = js.Dynamic.literal(LOWER = js.Any.fromFunction1(LOWER))
    __obj.asInstanceOf[LOWER]
  }
  
  @scala.inline
  implicit class LOWEROps[Self <: LOWER] (val x: Self) extends AnyVal {
    
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
    def setLOWER(value: typings.anydbSql.mod.Column[String] => typings.anydbSql.mod.Column[String]): Self = this.set("LOWER", js.Any.fromFunction1(value))
  }
}
