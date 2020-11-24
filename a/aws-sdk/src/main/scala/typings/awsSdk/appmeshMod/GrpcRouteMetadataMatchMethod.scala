package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GrpcRouteMetadataMatchMethod extends js.Object {
  
  /**
    * The value sent by the client must match the specified value exactly.
    */
  var exact: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * The value sent by the client must begin with the specified characters.
    */
  var prefix: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * An object that represents the range of values to match on.
    */
  var range: js.UndefOr[MatchRange] = js.native
  
  /**
    * The value sent by the client must include the specified characters.
    */
  var regex: js.UndefOr[HeaderMatch] = js.native
  
  /**
    * The value sent by the client must end with the specified characters.
    */
  var suffix: js.UndefOr[HeaderMatch] = js.native
}
object GrpcRouteMetadataMatchMethod {
  
  @scala.inline
  def apply(): GrpcRouteMetadataMatchMethod = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GrpcRouteMetadataMatchMethod]
  }
  
  @scala.inline
  implicit class GrpcRouteMetadataMatchMethodOps[Self <: GrpcRouteMetadataMatchMethod] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setExact(value: HeaderMatch): Self = this.set("exact", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExact: Self = this.set("exact", js.undefined)
    
    @scala.inline
    def setPrefix(value: HeaderMatch): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setRange(value: MatchRange): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRegex(value: HeaderMatch): Self = this.set("regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegex: Self = this.set("regex", js.undefined)
    
    @scala.inline
    def setSuffix(value: HeaderMatch): Self = this.set("suffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
}
