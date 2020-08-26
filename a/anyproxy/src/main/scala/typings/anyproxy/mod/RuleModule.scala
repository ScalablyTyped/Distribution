package typings.anyproxy.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RuleModule extends js.Object {
  /**
    * When receiving https request, AnyProxy will call beforeDealHttpsRequest with param requestDetail.
    * If configed with forceProxyHttps in launching, AnyProxy will skip calling this method.
    * Only by returning true, AnyProxy will try to replace the certificate and intercept the https request.
    */
  var beforeDealHttpsRequest: js.UndefOr[
    js.Function1[/* requestDetail */ BeforeDealHttpsRequestDetail, MaybePromise[Boolean]]
  ] = js.native
  /** Before sending request to server, AnyProxy will call beforeSendRequest with param requestDetail. */
  var beforeSendRequest: js.UndefOr[
    js.Function1[
      /* requestDetail */ RequestDetail, 
      MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
    ]
  ] = js.native
  /** Before sending response to client, AnyProxy will call beforeSendResponse with param requestDetail responseDetail. */
  var beforeSendResponse: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* responseDetail */ ResponseDetail, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /** AnyProxy will call this method when failed to connect target server in https request. */
  var onConnectError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /**
    * AnyProxy will call this method when an error happened in request handling.
    * Errors usually are issued during requesting, e.g. DNS failure, request timeout.
    */
  var onError: js.UndefOr[
    js.Function2[
      /* requestDetail */ RequestDetail, 
      /* err */ Error, 
      MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ]
  ] = js.native
  /** Introduction of this rule file. AnyProxy will read this field and give some tip to user. */
  var summary: js.UndefOr[String] = js.native
}

object RuleModule {
  @scala.inline
  def apply(): RuleModule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleModule]
  }
  @scala.inline
  implicit class RuleModuleOps[Self <: RuleModule] (val x: Self) extends AnyVal {
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
    def setBeforeDealHttpsRequest(value: /* requestDetail */ BeforeDealHttpsRequestDetail => MaybePromise[Boolean]): Self = this.set("beforeDealHttpsRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeDealHttpsRequest: Self = this.set("beforeDealHttpsRequest", js.undefined)
    @scala.inline
    def setBeforeSendRequest(
      value: /* requestDetail */ RequestDetail => MaybePromise[js.UndefOr[BeforeSendRequestResult | Null]]
    ): Self = this.set("beforeSendRequest", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeSendRequest: Self = this.set("beforeSendRequest", js.undefined)
    @scala.inline
    def setBeforeSendResponse(
      value: (/* requestDetail */ RequestDetail, /* responseDetail */ ResponseDetail) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = this.set("beforeSendResponse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteBeforeSendResponse: Self = this.set("beforeSendResponse", js.undefined)
    @scala.inline
    def setOnConnectError(
      value: (/* requestDetail */ RequestDetail, /* err */ Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = this.set("onConnectError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnConnectError: Self = this.set("onConnectError", js.undefined)
    @scala.inline
    def setOnError(
      value: (/* requestDetail */ RequestDetail, /* err */ Error) => MaybePromise[js.UndefOr[BeforeSendResponseResult | Null]]
    ): Self = this.set("onError", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
  
}

